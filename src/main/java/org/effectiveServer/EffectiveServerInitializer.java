package org.effectiveServer;

import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.socket.SocketChannel;
import io.netty.handler.codec.LengthFieldBasedFrameDecoder;
import io.netty.handler.codec.bytes.ByteArrayDecoder;
import io.netty.handler.codec.bytes.ByteArrayEncoder;
import io.netty.handler.codec.protobuf.*;

import cz.cvut.fel.esw.server.proto.*;

public class EffectiveServerInitializer extends ChannelInitializer<SocketChannel> {

    @Override
    protected void initChannel(SocketChannel ch) throws Exception {
        ChannelPipeline p = ch.pipeline();


        p.addLast(new LengthFieldBasedFrameDecoder(
                9999999,
                0,
                4,
                0,
                4
        ));
        p.addLast(new ProtobufDecoder(Request.getDefaultInstance()));

        /*
        p.addLast(new ProtobufVarint32LengthFieldPrepender());
        p.addLast(new ProtobufEncoder());*/

        p.addLast(new ByteArrayEncoder());


        p.addLast(new EffectiveServerHandler());
    }

}


