package javadoc_example.comments;

/**
 * @author Eve Leleka
 */
public class Person {
    /**
     * person's name
     */
    private String name;

    /**
     * This is a constructor to initialize person's object.
     * @param name an initial person name
     */
    public Person(String name) {
        this.name = name;
    }

    /**
     * To set a name of a person
     * @param name a new person name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * get person's name
     * @return person's name
     */
    public String getName() {
        return name;
    }

    /**
     * show person's name
     * @return person's name
     */
    public String show() {
        return "show: " + name;
    }

    /**
     * return a message from a person object
     * @return I am a person
     */
    public String talk() {
        return "I'm a person";
    }
}
