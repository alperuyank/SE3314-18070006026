package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Unit tests for the University class.
 */
public class UniversityTest {
    public UniversityTest() {
    }

    /**
     * Test for the addCourse() method.
     */
    @Test
    public void testAddCourse() {
        University university = new University();
        Course course = new Course("Computer Science", 100);
        university.addCourse(course);
        assertEquals(1, university.getCourses().size());
    }

    /**
     * Test for the registerStudentForCourse() method.
     */
    @Test
    public void testRegisterStudentForCourse() {
        University university = new University();
        Student student = new Student("John Doe", "002");
        Course course = new Course("Computer Science", 100);
        university.addCourse(course);
        university.registerStudentForCourse(student, course);
        assertTrue(course.getStudents().contains(student));
    }
}
