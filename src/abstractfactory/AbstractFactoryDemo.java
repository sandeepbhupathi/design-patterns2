package abstractfactory;

public class AbstractFactoryDemo {
    public static void main(String[] args) {
        AbstractFactory networkFactory =  ProducerFactory.getFactory("network");
        AbstractFactory mobileFactory = ProducerFactory.getFactory("mobile");

        System.out.println(mobileFactory.getMobile("apple").call()
                + networkFactory.getNetwork("airtel").signal());

        System.out.println(mobileFactory.getMobile("Nokia").call()
                + networkFactory.getNetwork("idea").signal());

        System.out.println(mobileFactory.getMobile("samsung").call()
                + networkFactory.getNetwork("jio").signal());
    }
}
