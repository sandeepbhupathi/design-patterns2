package prototype;

public class IntelDualcoreProcessor extends Processor {
    public IntelDualcoreProcessor(){
        type="Intel Duelcore Processor";
    }

    @Override
    void process() {
        System.out.println("Process from "+type);
    }
}
