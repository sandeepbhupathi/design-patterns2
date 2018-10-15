package prototype;

public class IntelQuadcoreProcessor extends Processor {
    public IntelQuadcoreProcessor(){
        type = "Intel Quadcore Processor";
    }
    @Override
    void process() {
        System.out.println("Process from "+type);
    }
}
