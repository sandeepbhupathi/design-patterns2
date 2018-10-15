package abstractfactory1;

public class Solution {

    public static void main(String args[]) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        Computer computer1 = new ComputerA();
        createComputer(computer1, new ComputerFactoryA() );
        System.out.println(computer1);

        Computer computer2 = new ComputerB();
        createComputer(computer2,new ComputerFactoryB());
        System.out.println(computer2);

        System.out.println("!!!!!Reflection Approach!!!!!!!");

        Computer computer3 = new ComputerA();
        createComputerRef(computer3);
        System.out.println(computer3);

        Computer computer4 = new ComputerB();
        createComputerRef(computer4);
        System.out.println(computer4);

    }

    private static void createComputerRef(Computer computer3) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        String partsType = computer3.getPartsType();

        computer3.add((CPU)Class.forName("abstractfactory1.CPU"+partsType).newInstance());
        computer3.add((Memory) Class.forName("abstractfactory1.Memory"+partsType).newInstance());

    }

    private static void createComputer(Computer computer1,ComputerFactory computerFactory) {
       computer1.add(computerFactory.getCPU());
       computer1.add(computerFactory.getMemory());
    }

}
