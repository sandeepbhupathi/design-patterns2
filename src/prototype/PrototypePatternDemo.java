package prototype;

public class PrototypePatternDemo {
    public static void main(String[] args) {
        ProcessorCache.loadCache();

        Processor amdProcessor = (Processor) ProcessorCache.getProcessor(1);

        Processor intelDualcoreProcessor = (Processor) ProcessorCache.getProcessor(2);

        Processor intelQuadcoreProcessor = (Processor) ProcessorCache.getProcessor(3);

        amdProcessor.process();

        intelDualcoreProcessor.process();

        intelQuadcoreProcessor.process();


    }
}
