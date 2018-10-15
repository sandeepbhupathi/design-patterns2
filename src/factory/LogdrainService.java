package factory;

public class LogdrainService implements CloudServices {
    @Override
    public void printCloudServiceName() {
        System.out.println("Logdrain Service");
    }
}
