package observer;

public class ObserverPatternDemo {
    public static void main(String[] args) {
        ProductUpdater productUpdater = new ProductUpdater();
        new StorePrice(productUpdater);
        new RetailPrice(productUpdater);
        new OnlinePrice(productUpdater);

        productUpdater.setState(50);
        productUpdater.setState(75);
    }
}
