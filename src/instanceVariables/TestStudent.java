/**
 * A class to test instance variables in the Student class.
 *
 * @author Carlos Limão.
 * @version April 8 2024
 */
package instanceVariables;

public class TestStudent {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();

        // Each object has it's own instance variables
        // The "name" instance variable can be acessed from "outside" using a reference.
        student1.name = "Carlos";
        student2.name = "Martim";
        student3.name = "André";
        System.out.println("Student 1 name: " + student1.name);
        System.out.println("Student 1 name: " + student2.name);
        System.out.println("Student 1 name: " + student3.name);

        // The "grade" instance variable cannot be accessed from "outside"
        //student1.grade = 20.0;                                        // Compilation error!
        //System.out.println("Student 1 grade: " + student1.grade);     // Compilation error!

        // Instance variables have default values
        System.out.println("Student 1 default grade: " + student1.getGrade());
        System.out.println("Student 2 default grade: " + student2.getGrade());
        System.out.println("Student 3 default grade: " + student3.getGrade());

        // ... but can be changed using the class provided "setter"
        student1.setGrade(15.0);
        student2.setGrade(16.0);
        student3.setGrade(17.0);
        System.out.println("Student 1 grade: " + student1.getGrade());
        System.out.println("Student 2 grade: " + student2.getGrade());
        System.out.println("Student 3 grade: " + student3.getGrade());
    }
}
