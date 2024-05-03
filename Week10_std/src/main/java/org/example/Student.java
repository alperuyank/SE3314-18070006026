package org.example;

/**
 * Represents a student with a name and an ID.
 */
public class Student {
    /**
     * Represents the name of the student.
     */
    private String studentName;

    /**
     * Represents the ID of the student.
     */
    private String studentID;


    /**
     * Constructs a new Student object with the given name and ID.
     *
     * @param name The name of the student
     * @param id   The ID of the student
     */
    public Student(final String name, final String id) {
        studentName = name;
        studentID = id;
    }

    /**
     * Gets the name of the student.
     *
     * @return The name of the student
     */
    public String getName() {
        return studentName;
    }
}
