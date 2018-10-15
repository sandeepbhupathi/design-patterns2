package observer;

public class OnlinePrice extends BaseProduct {

    public OnlinePrice(ProductUpdater productUpdater) {
        this.productUpdater = productUpdater;
        this.productUpdater.attach(this);
    }


    @Override
    public void update(int basePrice) {
        int onlineMaintenancePrice = 50;
        System.out.println("Online Price Updated to :"+(basePrice+onlineMaintenancePrice));
    }
}
