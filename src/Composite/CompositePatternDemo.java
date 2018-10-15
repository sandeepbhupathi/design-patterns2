package Composite;

import java.util.ArrayList;
import java.util.List;

public class CompositePatternDemo {
    public static void main(String[] args) {
        Employee developer = new Employee("Ram","payments",1234,null);

        List<Employee> teamLeadSubodinates = new ArrayList<Employee>();
        teamLeadSubodinates.add(developer);
        Employee teamLead = new Employee("Lakshman","payments",1235,teamLeadSubodinates);

        List<Employee> projectManagerSubodinates = new ArrayList<>();
        projectManagerSubodinates.add(developer);
        projectManagerSubodinates.add(teamLead);
        Employee projectManager = new Employee("RK","payments",12346,projectManagerSubodinates);

        List<Employee> deliveryManagerSubodinates = new ArrayList<>();
        deliveryManagerSubodinates.add(developer);
        deliveryManagerSubodinates.add(teamLead);
        deliveryManagerSubodinates.add(projectManager);
        Employee deliveryManager = new Employee("PK","payments",12347,deliveryManagerSubodinates);

        System.out.println("Developer Details: "+developer);
        System.out.println("TeamLead Details: "+teamLead);
        System.out.println("Project Manager Details: "+projectManager);
        System.out.println("Delivery Manager Details: "+deliveryManager);
    }
}
