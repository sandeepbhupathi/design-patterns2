package strategy;

public class StrtegyPatternDemo {
    public static void main(String args[]){
        PurchaseOrder purchaseOrder = new StrToDcPurchaseOrder();
        PurchaseOrderSystem poSystem = new PurchaseOrderSystem(purchaseOrder);
        poSystem.executePurchaseOrder();

        System.out.println("================================================================");

        PurchaseOrder strToStrPurchaseOrder = new StrToStrPurchaseOrder();
        PurchaseOrderSystem strToStrPOSystem = new PurchaseOrderSystem(strToStrPurchaseOrder);
        strToStrPOSystem.executePurchaseOrder();

        System.out.println("================================================================");

        PurchaseOrder strToVndrPurchaseOrder = new StrToVndrPurchaseOrder();
        PurchaseOrderSystem strToVndrPOSystem = new PurchaseOrderSystem(strToVndrPurchaseOrder);
        strToVndrPOSystem.executePurchaseOrder();


    }
}
