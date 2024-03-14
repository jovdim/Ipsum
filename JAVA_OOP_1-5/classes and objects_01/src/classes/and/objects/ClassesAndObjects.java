package classes.and.objects;

public class ClassesAndObjects {

    public static void main(String[] args) {

        //this thing is called instantiation
        Person p1 = new Person();
        Person p2 = new Person();

//we just reassign value to each attribute.
        p1.firstName = "lorem";
        p1.lastName = "Ipsum";
        p1.sex = 'M';
        p1.Age = 19;

        p2.firstName = "dolor";
        p2.lastName = "amet";
        p2.sex = 'F';
        p2.Age = 19;

        System.out.println("Hello, this is " + p2.firstName + " and her age is " + p2.Age + " as well as this is " + p1.firstName + " his age is " + p1.Age + " too");

    }

}

//To create object with to use the class. each class object the attribute should related base to their object name.
class Person {
// this is the attributes of the object. as you can see the Person objects its attibute it related.

    String firstName;
    String lastName;
    char sex;
    int Age;

    //purpose. (method)
}
