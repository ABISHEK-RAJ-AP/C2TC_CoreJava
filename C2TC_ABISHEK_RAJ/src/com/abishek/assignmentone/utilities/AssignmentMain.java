package com.abishek.assignmentone.utilities;


import com.abishek.assignmentone.employees.Manager;
import com.abishek.assignmentone.employees.Developer;

public class AssignmentMain {
    public static void main(String[] args) {

        Manager manager = new Manager();
        manager.setName("pri");
        manager.setEmployeeId(101);
        manager.setSalary(75000);
        manager.setDepartment("HR");


        Developer developer = new Developer();
        developer.setName("Bing");
        developer.setEmployeeId(102);
        developer.setSalary(65000);
        developer.setProgrammingLanguage("Java");


        System.out.println("Manager Details:");
        EmployeeUtilities.printManagerDetails(manager);

        System.out.println("\nDeveloper Details:");
        EmployeeUtilities.printDeveloperDetails(developer);
    }
}
