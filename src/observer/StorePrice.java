package observer;

public class StorePrice  extends BaseProduct{
    public StorePrice(ProductUpdater productUpdater) {
        this.productUpdater = productUpdater;
        this.productUpdater.attach(this);
    }


    @Override
    public void update(int basePrice) {
            int storeMaintenancePrice = 100;
            System.out.println("Store Price Updated to :"+(basePrice+storeMaintenancePrice));
    }


}
