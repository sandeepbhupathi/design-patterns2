package observer;

public class RetailPrice extends BaseProduct{


    public RetailPrice(ProductUpdater productUpdater) {
        this.productUpdater = productUpdater;
        productUpdater.attach(this);
    }

    @Override
    public void update(int basePrice) {
        int retailMaintenancePrice = 75;
        System.out.println("Retail Price Updated to :"+(basePrice+retailMaintenancePrice));
    }
}
