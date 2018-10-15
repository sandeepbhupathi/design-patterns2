package abstractfactory;

public class NetworkFactory implements AbstractFactory{
    @Override
    public Mobile getMobile(String mobileBrand) {
        return null;
    }

    @Override
    public Network getNetwork(String networkName) {
        if(networkName.equalsIgnoreCase("Airtel")){
            return new AirtelNetwork();
        }else if(networkName.equalsIgnoreCase("Jio")){
            return new JioNetwork();
        }else if(networkName.equalsIgnoreCase("Idea")){
            return new IdeaNetwork();
        }else {
            return null;
        }
    }
}
