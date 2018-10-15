package strategy;

import java.math.BigDecimal;
import java.math.BigInteger;

public interface PurchaseOrder {
    public BigInteger createOrder();
    public BigDecimal auditOrder(BigInteger poNbr);
    public void shipOrder(BigInteger poNbr);
    public boolean makePayment(BigInteger poNbr,BigDecimal paymentAmount);
}
