package com.gukan.assignmentone.utilities;


import com.gukan.assignmentone.employees.Manager;
import com.gukan.assignmentone.employees.Developer;

public class AssignmentMain {
    public static void main(String[] args) {

        Manager manager = new Manager();
        manager.setName("Alice");
        manager.setEmployeeId(101);
        manager.setSalary(75000);
        manager.setDepartment("HR");


        Developer developer = new Developer();
        developer.setName("Bob");
        developer.setEmployeeId(102);
        developer.setSalary(65000);
        developer.setProgrammingLanguage("Java");


        System.out.println("Manager Details:");
        EmployeeUtilities.printManagerDetails(manager);

        System.out.println("\nDeveloper Details:");
        EmployeeUtilities.printDeveloperDetails(developer);
    }
}