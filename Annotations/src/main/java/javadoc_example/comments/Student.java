package javadoc_example.comments;

import javadoc_example.comments.Person;

class Student extends Person {
    /**
     * student's age
     */
    private int age;

    /**
     * @param name student's name
     * @param age  student's age
     */
    public Student(String name, int age) {
        super(name);
        this.age = age;
    }
}