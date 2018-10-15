package abstractfactory;

public class JioNetwork implements Network {
    @Override
    public String signal() {
        return "using JIO Network";
    }
}
