package abstractfactory;

public interface AbstractFactory {
    Mobile getMobile(String mobileBrand);
    Network getNetwork(String networkName);

}
