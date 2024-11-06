package com.tnsif.dayfive.multilevelinheritance;
import java.util.Date;
class Person {
    private String name;
    private long contactNo;
    private Date dateOfBirth;

    public Person() {}

    public Person(String name, long contactNo, Date dateOfBirth) {
        super();
        this.name = name;
        this.contactNo = contactNo;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getContactNo() {
        return contactNo;
    }

    public void setContactNo(long contactNo) {
        this.contactNo = contactNo;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    // toString method
    @Override
    public String toString() {
        return "Person [name=" + name + ", contactNo=" + contactNo + ", dateOfBirth=" + dateOfBirth + "]";
    }
}

class Employee extends Person {
    private String deptName;
    private double baseSalary;

    // Default Constructor
    public Employee() {}

    // Parameterized Constructor
    public Employee(String name, long contactNo, Date dateOfBirth, String deptName, double baseSalary) {
        super(name, contactNo, dateOfBirth); 
        this.deptName = deptName;
        this.baseSalary = baseSalary;
    }

    // Getter and Setter methods
    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    // toString method
    @Override
    public String toString() {
        return "Employee [" + super.toString() + ", deptName=" + deptName + ", baseSalary=" + baseSalary + "]";
    }
}

// Subclass: LevelOneEmployee (inherits from Employee)
class LevelOneEmployee extends Employee {
    private int noOfShares;
    private String authority;

    // Default Constructor
    public LevelOneEmployee() {}

    // Parameterized Constructor
    public LevelOneEmployee(String name, long contactNo, Date dateOfBirth, String deptName, double baseSalary, int noOfShares, String authority) {
        super(name, contactNo, dateOfBirth, deptName, baseSalary); // Calling parent class constructor
        this.noOfShares = noOfShares;
        this.authority = authority;
    }

    // Getter and Setter methods
    public int getNoOfShares() {
        return noOfShares;
    }

    public void setNoOfShares(int noOfShares) {
        this.noOfShares = noOfShares;
    }

    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }

    // toString method
    @Override
    public String toString() {
        return "LevelOneEmployee [" + super.toString() + ", noOfShares=" + noOfShares + ", authority=" + authority + "]";
    }
}

// Main class to demonstrate Multilevel Inheritance
public class MultilevelInheritanceDemo {
    public static void main(String[] args) {
        // Creating Person object
        Person p1 = new Person("Atharv", 7878767676L, new Date(100, 11, 2)); // 2000-12-02 (Date(year - 1900, month - 1, day))
        System.out.println(p1);

        // Creating Employee object
        p1 = new Employee("Pranav", 8080807070L, new Date(95, 4, 7), "Sales", 45000); // 1995-05-07
        System.out.println(p1);

        // Creating LevelOneEmployee object
        p1 = new LevelOneEmployee("Madhur", 9880807227L, new Date(88, 1, 15), "Account", 85000, 200, "Signing Authority"); // 1988-02-15
        System.out.println(p1);
    }
}
