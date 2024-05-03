package org.example;

import java.util.HashMap;
import java.util.Map;

/**
 * Represents a University with courses and student enrollments.
 */
public class University {
    /**
     * Represents the map of courses where the key is the course name and the value is the course object.
     */
    private Map<String, Course> courses = new HashMap<>();

    /**
     * Gets the map of courses.
     *
     * @return The map of courses
     */
    public Map<String, Course> getCourses() {
        return courses;
    }


    public University() {
    }

    /**
     * Adds a course to the university.
     *
     * @param course The course to add
     */
    public void addCourse(final Course course) {
        if (course != null && !courses.containsKey(course.getCourseName())) {
            courses.put(course.getCourseName(), course);
        }
    }

    /**
     * Registers a student for a course.
     *
     * @param student The student to register
     * @param course  The course to register for
     */
    public void registerStudentForCourse(final Student student,final Course course) {
        if (courses.containsKey(course.getCourseName())) {
            courses.get(course.getCourseName()).addStudent(student);
        }
    }

    /**
     * Prints the list of student enrollments for each course.
     */
    public void printStudentEnrollments() {
        for (Course course : courses.values()) {
            System.out.println("Course: " + course.getCourseName());
            for (Student student : course.getStudents()) {
                System.out.println("Student: " + student.getName());
            }
        }
    }
}
