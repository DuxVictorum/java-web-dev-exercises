package org.launchcode.java.demos.lsn4classes2;

public class Student {

    private static int nextStudentId = 1;
    private String name;
    private int studentId;
    private int numberOfCredits = 0;
    private double gpa = 0.0;

    public Student (String name, int studentId, int numberOfCredits, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }

    public Student (String name, int studentId) {
        this(name, studentId, 0, 0);
    }

    public Student (String name) {
        this(name, nextStudentId);
        nextStudentId++;
    }

    public String studentInfo() {
        return (this.name + " has a GPA of: " + this.gpa);
    }


     //TODO Part 1: DONE!
    public static String getGradeLevel(int credits) {
        if (credits == 0) {
            return "No credits found for this student.";
        } else if (credits < 30) {
            return "Freshman";
        } else if (credits < 60) {
            return "Sophomore";
        } else if (credits < 90) {
            return "Junior";
        } else {
            return "Senior";
        }
    }

    // TODO Part 2: DONE!
    public void addGrade(int courseCredits, double grade) {
        double existingQS = this.gpa * this.numberOfCredits;
        double courseQS = courseCredits * grade;
        double newQS = existingQS + courseQS;
        this.numberOfCredits += courseCredits;
        this.gpa = newQS / numberOfCredits;
    }

    // TODO: Add your custom 'toString' method here. --> DONE!
    @Override
    public String toString() {
        String report = "\nStudent report: " + this.name + " (ID: " + this.studentId +
                ")" + "\nCredits: " + this.numberOfCredits +
                "\nClass status: " + getGradeLevel(numberOfCredits) +
                "\nGPA: " + this.gpa;
        return report;
    }

    // TODO: Add your custom 'equals' method here. Consider which fields should match in order to call two
    //  Student objects equal.
    public boolean equals(Object toCompare) {
        if (toCompare == this) {
            return true;
        }
        if (toCompare == null) {
            return false;
        }
        if (toCompare.getClass() != getClass()) {
            return false;
        }
        Student theStudent = (Student) toCompare;
        return theStudent.getStudentId() == getStudentId();
    }

    public String getName() {
        return name;
    }

    public int getStudentId() {
        return studentId;
    }

    public int getNumberOfCredits() {
        return numberOfCredits;
    }

    public double getGpa() {
        return gpa;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    private void setNumberOfCredits(int numberOfCredits) {
        this.numberOfCredits = numberOfCredits;
    }

    public static void main(String[] args) {
        Student sally = new Student("Sally",1,1,4.0);
        System.out.println("\nThe Student class works! " + sally.getName() + " is a student!");
        System.out.println(sally);
        sally.addGrade(12, 3.5);
        System.out.println(sally);
        sally.addGrade(25, 3.8);
        System.out.println(sally);
    }
}
