package strategy;

import java.math.BigDecimal;
import java.math.BigInteger;

public class PurchaseOrderSystem {
    private PurchaseOrder purchaseOrder;

    public PurchaseOrderSystem(PurchaseOrder purchaseOrder){
        this.purchaseOrder = purchaseOrder;
    }

    public void executePurchaseOrder(){
        BigInteger poNbr = purchaseOrder.createOrder();
        BigDecimal orderPaymentAmout = purchaseOrder.auditOrder(poNbr);
        purchaseOrder.shipOrder(poNbr);
        purchaseOrder.makePayment(poNbr,orderPaymentAmout);
    }
}
