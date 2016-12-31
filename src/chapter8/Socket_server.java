package chapter8;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.nio.channels.AsynchronousServerSocketChannel;
import java.nio.channels.AsynchronousSocketChannel;
import java.nio.channels.Channels;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by hadeslee on 2017-01-01.
 */
public class Socket_server {
    private static InetSocketAddress hostAddress;
    private static AtomicInteger connectionCount;

    public static void main(String[] args) throws IOException, ClassNotFoundException, InterruptedException, ExecutionException, TimeoutException {
        // Server Side
        hostAddress = new InetSocketAddress(InetAddress.getByName("127.0.0.1"), 2583);
        Future<AsynchronousSocketChannel> serverFuture = null;
        AsynchronousServerSocketChannel serverSocketChannel =
                AsynchronousServerSocketChannel.open().bind(hostAddress);
        serverFuture = serverSocketChannel.accept();
        final AsynchronousSocketChannel clientSocket = serverFuture.get(2000, TimeUnit.MILLISECONDS);
        System.out.println("Connected!");
        if ((clientSocket != null) && (clientSocket.isOpen())) {
            InputStream connectionInputStream = Channels.newInputStream(clientSocket);
            ObjectInputStream ois = null;
            ois = new ObjectInputStream(connectionInputStream);
            while (true) {
                Object object = ois.readObject();
                if (object.equals("EOF")) {

                    connectionCount.decrementAndGet();
                    clientSocket.close();
                    break;
                }
                System.out.println("Received :" + object);
            }
            ois.close();
            connectionInputStream.close();
        }
    }
}
