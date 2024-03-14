/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author jovdim
 */
import java.util.Scanner;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the Students number to be registered: ");
        int studentchoice = s.nextInt();
        s.nextLine();
        newStudents students[] = new newStudents[studentchoice];

        for (int x = 0; students.length > x; x++) {
            System.out.println("Student 0" + (x + 1));
            System.out.print("First Name: ");
            String firstName = s.nextLine();
            System.out.print("Last Name: ");
            String lastName = s.nextLine();
            System.out.print("Course: ");
            String course = s.nextLine();
            System.out.print("Section: ");
            int section = s.nextInt();
            s.nextLine();
            System.out.print("Year: ");
            int year = s.nextInt();
            s.nextLine();
            students[x] = new newStudents(firstName, lastName, course, section, year);
            System.out.println("");
        }
        for (newStudents student : students) {
            student.studentInfo();
            System.out.println("");
        }

    }

}

class newStudents {

    private String firstName, lastName;
    private String course;
    private int year, section;

    newStudents(String firstName, String lastName, String course, int section, int year) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.course = course;
        this.section = section;
        this.year = year;

    }

    void studentInfo() {
        System.out.println("Full Name: " + firstName + " " + lastName + "\nCourse: " + course + "\nSection: " + section + "\nYear: " + year);
    }

}
