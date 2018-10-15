package factory;

public class UserProvidedService implements CloudServices {
    @Override
    public void printCloudServiceName() {
        System.out.println("User Provided Service");
    }
}
