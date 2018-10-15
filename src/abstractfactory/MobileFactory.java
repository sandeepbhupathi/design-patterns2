package abstractfactory;

public class MobileFactory implements AbstractFactory {
    @Override
    public Mobile getMobile(String mobileBrand) {
        if(mobileBrand.equalsIgnoreCase("Apple")){
            return new AppleMobile();
        } else if (mobileBrand.equalsIgnoreCase("Samsung")) {
            return new SamsungMobile();
        }else if(mobileBrand.equalsIgnoreCase("Nokia")){
            return new NokiaMobile();
        }else {
            return null;
        }
    }

    @Override
    public Network getNetwork(String networkName) {
        return null;
    }
}
