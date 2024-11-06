package com.tnsif.dayfive.hierarchicalinheritance;

public class HierarchicalInhDemo {

    // Person class (Base class)
    static class Person {
        private String name;
        private String city;

        public Person() {
            System.out.println("Person class default constructor");
            name = "Amit";
            city = "Pune";
        }

        public Person(String name, String city) {
            this.name = name;
            this.city = city;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        @Override
        public String toString() {
            return "Person [name=" + name + ", city=" + city + "]";
        }
    }
    static class Employee extends Person {
        private int empId;
        private float salary;
        private String dept;

        public Employee() {
            System.out.println("Employee Class Default Constructor");
        }

        public Employee(int empId, float salary, String dept) {
            this.empId = empId;
            this.salary = salary;
            this.dept = dept;
        }

        public Employee(String name, String city, int empId, float salary, String dept) {
            super(name, city);
            this.empId = empId;
            this.salary = salary;
            this.dept = dept;
        }

        public int getEmpId() {
            return empId;
        }

        public void setEmpId(int empId) {
            this.empId = empId;
        }

        public float getSalary() {
            return salary;
        }

        public void setSalary(float salary) {
            this.salary = salary;
        }

        public String getDept() {
            return dept;
        }

        public void setDept(String dept) {
            this.dept = dept;
        }

        @Override
        public String toString() {
            return "Employee [empId=" + empId + ", salary=" + salary + ", dept=" + dept + ", getName()=" + getName()
                    + ", getCity()=" + getCity() + "]";
        }
    }
    static class Student extends Person {
        private String clas;
        private float per;

        public Student() {
            System.out.println("Student class default constructor");
            clas = "FY";
            per = 70;
        }

        public Student(String clas, float per) {
            this.clas = clas;
            this.per = per;
        }

        public String getClas() {
            return clas;
        }

        public void setClas(String clas) {
            this.clas = clas;
        }

        public float getPer() {
            return per;
        }

        public void setPer(float per) {
            this.per = per;
        }

        public Student(String name, String city, String clas, float per) {
            super(name, city);
            this.clas = clas;
            this.per = per;
        }

        @Override
        public String toString() {
            return "Student [clas=" + clas + ", per=" + per + ", getName()=" + getName() + ", getCity()=" + getCity()
                    + "]";
        }
    }

    public static void main(String[] args) {
        Person p1 = new Person();
        System.out.println("----------------- Person Details ---------------------");
        System.out.println(p1);

        Person p;
        p = new Person("Abishek", "Chennai");
        if (p instanceof Person)
            System.out.println("Person Details " + p);

        p = new Employee("Nikhil", "Mumbai", 101, 67000, "Sales");
        if (p instanceof Employee)
            System.out.println("Employee Details " + p);

        p = new Student("Pankaj", "Pune", "FE", 88);
        if (p instanceof Student)
            System.out.println("Student Details " + p);
    }
}
