package bridge;

import java.math.BigInteger;

public interface CallingNetwork {
    public void call(boolean signal,int callcost,BigInteger phoneNumber);
}
