package abstractfactory1;

public abstract class Computer {
    private CPU _cpu;
    private Memory _memory;

    public void add(CPU cpua) {
        _cpu=cpua;
    }

    public void add(Memory memoryA) {
        _memory=memoryA;
    }

    @Override
    public String toString() {
        return String.format("%s, %s, %s",getClass(),_cpu,_memory);
    }

    public abstract String getPartsType();
}
