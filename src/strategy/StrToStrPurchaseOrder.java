package strategy;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Random;

public class StrToStrPurchaseOrder implements PurchaseOrder {

    @Override
    public BigInteger createOrder() {
        int poNbr = new Random().nextInt(1000);
        System.out.println("Created an Order for Store To Store with PO Nbr: "+poNbr);
        return new BigInteger(""+poNbr);
    }

    @Override
    public BigDecimal auditOrder(BigInteger poNbr) {
        System.out.println("Audit for an PO Nbr: "+poNbr+" which is for Store To Str for amount: 100$");
        return new BigDecimal("100");
    }

    @Override
    public void shipOrder(BigInteger poNbr) {
        System.out.println("Order has been shipped for PO Nbr: "+poNbr);
    }

    @Override
    public boolean makePayment(BigInteger poNbr, BigDecimal paymentAmount) {
        System.out.println("Payment recieved for PO Nbr: "+poNbr+" which is for Payment : "+paymentAmount);
        return true;
    }
}
