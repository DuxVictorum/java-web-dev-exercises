package org.launchcode.java.demos.lsn3classes1;

public class Teacher {

    String firstName;
    String lastName;
    String subject;
    int yearsTeaching;

    public Teacher(String firstName, String lastName, String subject, int yearsTeaching) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.subject = subject;
        this.yearsTeaching = yearsTeaching;
    }

    public String getName() {
        return firstName + " " + lastName;
    }
    public void changeName(String aFirstName, String aLastName) {
        this.firstName = aFirstName;
        this.lastName = aLastName;
    }

    public String getSubject() {
        return subject;
    }
    public void setSubject(String aSubject) {
        this.subject = aSubject;
    }

    public int getYearsTeaching() {
        return yearsTeaching;
    }
    public void setYearsTeaching(int years) {
        this.yearsTeaching = years;
    }

    public void updateNewYear() {
        this.yearsTeaching += 1;
    }
}
