package org.fan;


/**
 * Created by fletcher on 2019/5/8.
 */
public class ClientTest {

    public static void main(String[] args) {
        WebsocketClientEndpoint websocketClientEndpoint = new WebsocketClientEndpoint("wss://explorer.binance.org/ws/block");
        try {
            Thread.sleep(10000L);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

}
