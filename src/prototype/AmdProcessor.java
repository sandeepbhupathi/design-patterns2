package prototype;

public class AmdProcessor extends Processor{
    public  AmdProcessor(){
        type = "AMD Processor";
    }

    @Override
    void process() {
        System.out.println("Process from "+type);
    }
}
