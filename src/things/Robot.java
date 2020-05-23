package things;

public class Robot extends Thing {

    // Properties
    private String name;
    private int charge;

    //Constructors
    public Robot(String name) {
        setName(name);
    }

////////////////////////////////  SETTERS  ////////////////////////////////
    public void chargeIt(int charge) {
        
        if (this.charge + charge > 100) {
            this.charge = 100;
            System.out.println("The battery is full");
        }
        if (this.charge + charge < 0) {
            this.charge = 0;
            System.out.println("The battery is empty");
        }
        else this.charge += charge;
    }

    public void setName(String name) {
        this.name = name;
    }




////////////////////////////////  GETTERS  ////////////////////////////////
    public int getCharge() {
        return charge;
    }

    public String getName() {
        return name;
    }


    public String toString() {
        return "\nRobot: " + name + ". Battery level: " + charge + "%";
    }
}
