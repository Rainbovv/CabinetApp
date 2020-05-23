package things;

public class Book extends Thing{
    private String name;

    public Book(String name) {
        setName(name);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return "\nBook: " + name;
    }
}
