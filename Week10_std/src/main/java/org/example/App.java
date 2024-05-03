package org.example;

/**
 * Hello world!
 *
 */
public class App {
    private App() {
    }

    /**
     * @param args Command line arguments
     */

    public static void main(final String[] args) {
        University myUniversity = new University();
        Student student1 = new Student("Jane Doe", "001");
        Student student2 = new Student("John Smith", "002");
        Course course1 = new Course("Software Engineering", 30);
        Course course2 = new Course("Data Structures", 40);

        myUniversity.addCourse(course1);
        myUniversity.addCourse(course2);
        myUniversity.registerStudentForCourse(student1, course1);
        myUniversity.registerStudentForCourse(student2, course2);

        System.out.println("Total courses offered: " + Course.getTotalCourses());
        myUniversity.printStudentEnrollments();
    }
}
