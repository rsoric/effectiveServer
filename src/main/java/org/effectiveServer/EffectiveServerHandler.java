package org.effectiveServer;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.channel.SimpleChannelInboundHandler;
import cz.cvut.fel.esw.server.proto.*;
import io.netty.handler.codec.ByteToMessageDecoder;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.zip.GZIPInputStream;

@ChannelHandler.Sharable
public class EffectiveServerHandler extends SimpleChannelInboundHandler {

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, Object msg) throws Exception {

        Request req = (Request) msg;

        if (req.hasPostWords()) {
            //System.out.println("Message has postwords..");
            byte[] decompressedWords = decompress(req.getPostWords().getData().toByteArray());
            String wordsToAdd = new String(decompressedWords, StandardCharsets.UTF_8);

            for (String word : wordsToAdd.split("\\s+")) {
                EffectiveServer.hoe.add(word);
            }
            //System.out.println(" ");
            Response.Builder builder = Response.newBuilder();
            builder.setStatus(Response.Status.OK);
            //ctx.write(builder.build());
            Response response = builder.build();
            byte[] response_data = response.toByteArray();
            int len_output = response_data.length;
            byte[] response_size = ByteBuffer.allocate(4).putInt(len_output).array();
            ctx.write(response_size);
            ctx.write(response_data);
            //System.out.println("OK sent!");
            //System.out.println(" ");
        } else if (req.hasGetCount()) {
            //System.out.println("Message has getcount ");
            Response.Builder builder = Response.newBuilder();
            builder.setStatus(Response.Status.OK);
            builder.setCounter(EffectiveServer.hoe.size());
            Response response = builder.build();
            //ctx.write(response);
            byte[] response_data = response.toByteArray();
            int len_output = response_data.length;
            byte[] response_size = ByteBuffer.allocate(4).putInt(len_output).array();
            ctx.write(response_size);
            ctx.write(response_data);
            //System.out.println("getcount of " + EffectiveServer.hoe.size() + " sent");
            //System.out.println(" ");
            EffectiveServer.hoe = new NonblockStringSet(1000000);
        }
    }

    @Override
    public void channelReadComplete(ChannelHandlerContext ctx) {
        ctx.flush();
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) {
        cause.printStackTrace();
        ctx.close();
    }

    public static byte[] decompress(final byte[] input) throws IOException
    {
        try (ByteArrayInputStream bin = new ByteArrayInputStream(input);
             GZIPInputStream gzipper = new GZIPInputStream(bin))
        {
            byte[] buffer = new byte[1024];
            ByteArrayOutputStream out = new ByteArrayOutputStream();

            int len;
            while ((len = gzipper.read(buffer)) > 0) {
                out.write(buffer, 0, len);
            }

            gzipper.close();
            out.close();
            return out.toByteArray();
        }
    }

}
