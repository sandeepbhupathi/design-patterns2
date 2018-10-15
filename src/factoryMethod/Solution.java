package factoryMethod;


public class Solution {
    public static void main(String args[]){

        Developer developer = new Developer();
        developer.getReadyForTravel();
        System.out.println(developer);

        SalesExecutive salesExecutive = new SalesExecutive();
        salesExecutive.getReadyForTravel();
        System.out.println(salesExecutive);

        SalesEngineer salesEngineer = new SalesEngineer();
        salesEngineer.getReadyForTravel();
        System.out.println(salesEngineer);

    }
}
