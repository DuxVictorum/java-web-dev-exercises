package org.launchcode.java.demos.lsn3classes1;

public class SchoolPractice {
    public static void main(String[] args) {

        Student s1 = new Student("Mark", 2532, 1, 4.0);
        System.out.println(s1.getName());
        s1.setName("Ralph");
        System.out.println(s1.getName());
    }
}
