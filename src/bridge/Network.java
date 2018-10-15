package bridge;

public abstract class Network{
    protected CallingNetwork callingNetwork;

    public Network(CallingNetwork callingNetwork){
        this.callingNetwork = callingNetwork;
    }

    public abstract void call();
}
