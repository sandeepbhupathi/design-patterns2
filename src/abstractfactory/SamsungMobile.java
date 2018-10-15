package abstractfactory;

public class SamsungMobile implements Mobile {
    @Override
    public String call() {
        return "Calling from Samsung Mobile ";
    }
}
