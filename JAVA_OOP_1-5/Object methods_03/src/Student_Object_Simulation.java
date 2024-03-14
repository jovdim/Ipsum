/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jovdim
 */
//EXERCISE 03
public class Student_Object_Simulation {

    public static void main(String[] args) {

        Student s1 = new Student("lorem", "Ipsum", "Computer Science", 101, 1, 98, 97);
        Student s2 = new Student("dolor", "amet", "Computer Science", 201, 2, 98, 91);
        Student s3 = new Student("consec", "amor", "Computer Science", 301, 3, 83, 86);
        Student s4 = new Student("eros", "leos", "Computer Science", 401, 4, 88, 78);
        s1.introduceSelf();
        s1.evaluateGrade();

        System.out.println("");

        s2.introduceSelf();
        s2.evaluateGrade();

        System.out.println("");

        s3.introduceSelf();
        s3.evaluateGrade();

        System.out.println("");

        s4.introduceSelf();
        s4.evaluateGrade();

    }

}

class Student {

    String firstName, lastName, course;
    int year, section, midtermGrade, finalGrade;

//construction
    Student(String firstName, String lastName, String course, int section, int year, int midtermGrade, int finalGrade) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.course = course;
        this.year = year;
        this.section = section;
        this.midtermGrade = midtermGrade;
        this.finalGrade = finalGrade;

    }

    void introduceSelf() {

        System.out.println("firstname: " + firstName + "\nlastname: " + lastName + "\ncousre: " + course + "\nsection: " + section + "\nyear: " + year);
    }

    //to return an int
    void evaluateGrade() {
        int totalAverage = (midtermGrade + finalGrade) / 2;
        System.out.println("Grade Average: " + totalAverage);

        String remarks = "";

        if (totalAverage > 100) {
            remarks = "Invalid Grades";
        } else if (totalAverage >= 98) {
            remarks = "With highest honor";
        } else if (totalAverage >= 95) {
            remarks = "With high honor";
        } else if (totalAverage >= 90) {
            remarks = "With honor";
        } else if (totalAverage >= 75) {
            remarks = "Passed";
        } else {
            remarks = "Failed";
        }

        System.out.println("Remarks: " + remarks);
    }

}
