package singleton;

public class SingletonTest {

    private  static SingletonTest singletonTest;
    private SingletonTest(){

    }

    public static SingletonTest getIntance(){
        if(singletonTest==null){
            singletonTest = new SingletonTest();
            return singletonTest;
        }
        return singletonTest;
    }

    public String printObject(){
        return "Singleton Test Object ref"+singletonTest;
    }
}
