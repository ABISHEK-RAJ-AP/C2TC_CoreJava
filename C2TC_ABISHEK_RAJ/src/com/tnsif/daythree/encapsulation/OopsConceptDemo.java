package com.tnsif.daythree.encapsulation;

public class OopsConceptDemo {

    private int serialNum;
    private String name;
    private int age;

    public OopsConceptDemo(String name, int age, int serialNum) {
        this.name = name;
        this.age = age;
        this.serialNum = serialNum;
    }

    public int getSerialNum() {
        return serialNum;
    }

    public void setSerialNum(int serialNum) {
        this.serialNum = serialNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Overridden toString method to display object details
    @Override
    public String toString() {
        return "OopsConceptDemo [Serial Number=" + serialNum + ", Name=" + name + ", Age=" + age + "]";
    }

    public static void main(String[] args) {
        // Create an instance with the constructor
        OopsConceptDemo ob = new OopsConceptDemo("Abishek Raj", 21, 1);
        System.out.println(ob.toString());

        // Update values using setter methods
        ob.setName("Dr House");
        ob.setSerialNum(2);
        ob.setAge(25);

        System.out.println("After update:");
        System.out.println("Name: " + ob.getName());
        System.out.println("Serial Number: " + ob.getSerialNum());
        System.out.println("Age: " + ob.getAge());
    }
}
