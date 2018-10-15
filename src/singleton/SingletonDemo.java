package singleton;

public class SingletonDemo {
    public static void main(String[] args) {
        SingletonTest singletonTest = SingletonTest.getIntance();
        System.out.println(singletonTest.printObject());
        SingletonTest singletonTest2 = SingletonTest.getIntance();
        System.out.println(singletonTest2.printObject());
    }
}
