package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Unit tests for the Course class.
 */
public class CourseTest {
    public CourseTest() {
    }

    /**
     * Test for the addStudent() method.
     */
    @Test
    public void testAddStudent() {
        Course course = new Course("Mathematics", 30);
        Student student = new Student("Alice Smith", "003");
        course.addStudent(student);
        assertTrue(course.getStudents().contains(student));
    }
}
