package bridge;

import java.math.BigDecimal;
import java.math.BigInteger;

public class NetworkCalling extends Network {
    int callcost;
    BigInteger phoneNumber;
    boolean signal;
    public NetworkCalling(int callcost, BigInteger phoneNumber, boolean signal, CallingNetwork callingNetwork){
        super(callingNetwork);
        this.callcost=callcost;
        this.phoneNumber=phoneNumber;
        this.signal=signal;
    }
    @Override
    public void call() {
            callingNetwork.call(signal,callcost,phoneNumber);
    }
}
