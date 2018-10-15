package factory;

public class FactoryPatternMain {
    public static void main(String[] args) {

        Object a,b,c,d,e;
        e= new Object();
        b=a=e;
        e=new Object();
        int x =10;
        System.out.println(new FactoryPatternMain().change(x));
        System.out.println(x);

         int a1[] = new int[2];
         System.out.println(a1.length);

        CloudServicesFactory servicesFactory = new CloudServicesFactory();
        servicesFactory.getCloudService("log").printCloudServiceName();
        servicesFactory.getCloudService("router").printCloudServiceName();
        servicesFactory.getCloudService("user").printCloudServiceName();
        servicesFactory.getCloudService("managed").printCloudServiceName();
    }

    int change(int x){
        x=12;
        return x;
    }
}
