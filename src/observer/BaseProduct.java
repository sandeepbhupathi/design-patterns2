package observer;

public abstract class BaseProduct {
    ProductUpdater productUpdater;
    public abstract void  update(int basePrice);

}
