package org.effectiveServer;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.handler.logging.LogLevel;
import io.netty.handler.logging.LoggingHandler;

import java.util.concurrent.ConcurrentHashMap;

public class EffectiveServer {
    static final int PORT = Integer.parseInt(System.getProperty("port", "3335"));

    //static ConcurrentHashMap <String, Integer> words = new ConcurrentHashMap(1000000);

    public static StringSet hoe = new NonblockStringSet(1000000);

    public static void main(String[] args) throws InterruptedException {
        EventLoopGroup serverGroup = new NioEventLoopGroup(1);
        EventLoopGroup workerGroup = new NioEventLoopGroup();

        try {
            ServerBootstrap bootStrap = new ServerBootstrap();
            bootStrap.group(serverGroup, workerGroup)
                    .channel(NioServerSocketChannel.class)
                    .option(ChannelOption.SO_RCVBUF,102400)
                    .childHandler(new EffectiveServerInitializer());
            bootStrap.bind(PORT).sync().channel().closeFuture().sync();
        } finally {
            serverGroup.shutdownGracefully();
            workerGroup.shutdownGracefully();
        }
    }
}