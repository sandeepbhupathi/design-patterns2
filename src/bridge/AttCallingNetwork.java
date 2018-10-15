package bridge;

import java.math.BigInteger;

public class AttCallingNetwork implements   CallingNetwork{
    @Override
    public void call(boolean signal, int callcost, BigInteger phoneNumber) {
        System.out.println("Call has been placed using ATT Network with call cost " +
                ":"+callcost+" to phone Number: "+phoneNumber.toString()+" and signal is :"+signal);
    }
}
