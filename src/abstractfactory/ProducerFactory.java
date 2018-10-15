package abstractfactory;

public class ProducerFactory {

    public static AbstractFactory getFactory(String factoryName){
        if(factoryName.equalsIgnoreCase("mobile"))
            return new MobileFactory();
        else if(factoryName.equalsIgnoreCase("network"))
            return new NetworkFactory();
        return null;
    }
}
