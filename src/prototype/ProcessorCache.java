package prototype;

import java.util.Hashtable;

public class ProcessorCache {
    private static Hashtable<Integer,Processor> processorHashtable = new Hashtable<>();

    public static Processor getProcessor(Integer processorID){
        Processor processor = processorHashtable.get(processorID);
        return (Processor) processor.clone();
    }

    public static void loadCache(){
        AmdProcessor amdProcessor = new AmdProcessor();
        amdProcessor.setId(1);
        processorHashtable.put(amdProcessor.getId(),amdProcessor);

        IntelDualcoreProcessor intelDualcoreProcessor = new IntelDualcoreProcessor();
        intelDualcoreProcessor.setId(2);
        processorHashtable.put(intelDualcoreProcessor.getId(),intelDualcoreProcessor);

        IntelQuadcoreProcessor intelQuadcoreProcessor = new IntelQuadcoreProcessor();
        intelQuadcoreProcessor.setId(3);
        processorHashtable.put(intelQuadcoreProcessor.getId(),intelQuadcoreProcessor);

    }
}
