package factory;

public class ManagedServices implements CloudServices {
    @Override
    public void printCloudServiceName() {
        System.out.println("Managed Service");
    }
}
