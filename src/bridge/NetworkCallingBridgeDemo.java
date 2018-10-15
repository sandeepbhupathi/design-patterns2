package bridge;

import java.math.BigInteger;

public class NetworkCallingBridgeDemo {
    public static void main(String[] args) {
        Network network = new NetworkCalling(10,new BigInteger("2027337199"),true,new AttCallingNetwork());
        Network network2 = new NetworkCalling(10,new BigInteger("9963168078"),true,new TMobileCallingNetwork());

        network.call();

        network2.call();
    }
}
