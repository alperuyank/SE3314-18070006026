package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a course with a name, capacity, and a list of enrolled students.
 */
public class Course {

    /**
     * Represents the total number of courses created.
     */
    private static int totalCourses = 0;

    /**
     * Represents the name of the course.
     */
    private String courseName;

    /**
     * Represents the maximum capacity of the course.
     */
    private final int capacity;

    /**
     * Represents the list of students enrolled in the course.
     */
    private List<Student> students = new ArrayList<>();


    /**
     * Constructs a new Course object with the given name and capacity.
     *
     * @param name     The name of the course (must not be null)
     * @param capacity The capacity of the course
     */
    public Course(final String name, final int capacity) {
        courseName = name;
        this.capacity = capacity;
        totalCourses++;
    }

    /**
     * Adds a student to the course if there is space available.
     *
     * @param student The student to add (must not be null)
     */
    public void addStudent(final Student student) {
        if (students.size() < capacity) {
            students.add(student);
        }
    }

    /**
     * Gets the list of students enrolled in the course.
     *
     * @return The list of students
     */
    public List<Student> getStudents() {
        return students;
    }

    /**
     * Gets the name of the course.
     *
     * @return The name of the course
     */
    public String getCourseName() {
        return courseName;
    }

    /**
     * Gets the total number of courses created.
     *
     * @return The total number of courses
     */
    public static int getTotalCourses() {
        return totalCourses;
    }
}
