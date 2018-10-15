package factory;

public class CloudServicesFactory {

    public CloudServices getCloudService(String cloudServiceName){
        if(cloudServiceName.equalsIgnoreCase("log")){
            return new LogdrainService();
        }else if (cloudServiceName.equalsIgnoreCase("managed")){
            return new ManagedServices();
        }else if(cloudServiceName.equalsIgnoreCase("router")){
            return new RouterService();
        }else if(cloudServiceName.equalsIgnoreCase("user")){
            return new UserProvidedService();
        }
        return null;
    }
}
