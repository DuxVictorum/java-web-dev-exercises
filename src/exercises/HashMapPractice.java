package exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapPractice {
    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String newStudent;

//        Add student info until ENTER is pressed
        System.out.println("Enter student info (or hit 'N' to close) ");
        do {
            System.out.println("Enter student name: ");
            newStudent = input.nextLine();
            if (!newStudent.equals("N")) {
                System.out.println("Enter this student's ID number: ");
                Integer studentID = input.nextInt();
                students.put(studentID, newStudent);
                input.nextLine();
            }
        } while (!newStudent.equals("N"));

        System.out.println("Class roster: ");
        for (Map.Entry<Integer, String> student : students.entrySet()) {
            System.out.println("Student ID \t" + student.getKey() + ", Name: " + student.getValue());
        }
    }
}


// 1) Take in user input of student names and IDs until ENTER is input
// 2) keys --> IDs; values --> names
// 3) Modify roster printing code accordingly