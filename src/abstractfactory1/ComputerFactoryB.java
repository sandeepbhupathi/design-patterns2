package abstractfactory1;

public class ComputerFactoryB implements ComputerFactory {
    @Override
    public CPU getCPU() {
        return new CPUB();
    }

    @Override
    public Memory getMemory() {
        return new MemoryB();
    }
}
