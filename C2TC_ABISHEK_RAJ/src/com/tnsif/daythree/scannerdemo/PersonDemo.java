package com.tnsif.daythree.scannerdemo;
import java.util.Scanner;
class Person {
    private String name;
    private int income;
    private String gender;
    private int age;
    private int tax;
    public int getTax() {
        return tax;
    }
    public void setTax(int tax) {
        this.tax = tax;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getIncome() {
        return income;
    }
    public void setIncome(int income) {
        this.income = income;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public String toString() {
        return "Person [name=" + name + ", income=" + income + ", gender=" + gender + ", age=" + age + ", tax=" + tax + "]";
    }
}
class TaxCalculation {
    public void calculateTax(Person person) {
        if (person.getAge() > 65 || person.getGender().equalsIgnoreCase("female")) {
            person.setTax(0);
            System.out.println("Tax not applicable");
        } else {
            if (person.getIncome() <= 160000) {
                person.setTax(0);
            } else if (person.getIncome() > 160000 && person.getIncome() <= 500000) {
                person.setTax((person.getIncome() - 160000) * 10 / 100);
            } else if (person.getIncome() > 500000 && person.getIncome() <= 800000) {
                person.setTax((person.getIncome() - 500000) * 20 / 100 + 34000);
            } else {
                person.setTax((person.getIncome() - 800000) * 30 / 100 + 94000);
            }
        }
    }
}
public class PersonDemo {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.print("Enter Person Name: ");
        String name = ob.next();
        
        System.out.print("Enter age: ");
        int age = ob.nextInt();
        
        System.out.print("Enter gender: ");
        String gender = ob.next();
        
        System.out.print("Enter taxable income: ");
        int income = ob.nextInt();
        Person person = new Person();
        person.setName(name);
        person.setAge(age);
        person.setGender(gender);
        person.setIncome(income);
        System.out.println("Person Details Before Tax Calculation: " + person);
        TaxCalculation calc = new TaxCalculation();
        calc.calculateTax(person);
        System.out.println("Person Details After Tax Calculation: " + person);
        ob.close();
    }
}
