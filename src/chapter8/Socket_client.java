package chapter8;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.nio.channels.AsynchronousSocketChannel;
import java.nio.channels.Channels;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/**
 * Created by hadeslee on 2017-01-02.
 */
public class Socket_client {
    private static java.net.SocketAddress hostAddress;

    public static void main(String[] args) {
        try (AsynchronousSocketChannel clientSocketChannel = AsynchronousSocketChannel.open()) {
            Future<Void> connectFuture = clientSocketChannel.connect(hostAddress);
            connectFuture.get(); // Wait until connection is done.
            OutputStream os = Channels.newOutputStream(clientSocketChannel);
            try (ObjectOutputStream oos = new ObjectOutputStream(os)) {
                for (int i = 0; i < 5; i++) {
                    oos.writeObject("Look at me " + i);
                    Thread.sleep(1000);
                }
                oos.writeObject("EOF");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
