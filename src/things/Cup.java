package things;

public class Cup extends Thing{

    // Properties
    private String name;
    private boolean filled;

    //Constructors
    public Cup(String name){
        setName(name);
    }


////////////////////////////////  SETTERS  ////////////////////////////////
    public void setName(String name) {
        this.name = name;
    }

    public void fill(boolean filled){
        this.filled = filled;
    }


////////////////////////////////  GETTERS  ////////////////////////////////
    public String getName() {
        return null;
    }

    public boolean isFilled() {
        return filled;
    }


    public String toString(){
        String print = "\nCup: " + name;

        if (isFilled()) print += " It's filled!";

        else print += " It's empty!";

        return print;
    }
}
