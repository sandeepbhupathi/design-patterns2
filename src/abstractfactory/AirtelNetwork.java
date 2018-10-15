package abstractfactory;

public class AirtelNetwork implements Network {
    @Override
    public String signal() {
        return "using Airtel Network";
    }
}
