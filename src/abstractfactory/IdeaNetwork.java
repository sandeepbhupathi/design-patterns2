package abstractfactory;

public class IdeaNetwork implements Network {
    @Override
    public String signal() {
        return "using Idea Network";
    }
}
