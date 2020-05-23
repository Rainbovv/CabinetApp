package cabinet;

import things.*;


public class Cabinet {
    private Thing[] cabinetsShelves = new Thing[3];


    public Cabinet(){}


////////////////////////////////  SETTERS  ////////////////////////////////
    public void put(String shelfName, Thing thing){

        try{
            if(cabinetsShelves[getNumByName(shelfName)] == null)
                cabinetsShelves[getNumByName(shelfName)]  = thing;
            else
                System.err.println("THE SHELF IS OCCUPIED");
        }
        catch (IndexOutOfBoundsException e){
            System.err.println("ERROR: NO SUCH SHELF!");
        }
    }
    
    
////////////////////////////////  GETTERS  ////////////////////////////////
    public Thing whatIsOn(String shelfName){
        Thing onShelf = null;

        try{
            onShelf = cabinetsShelves[getNumByName(shelfName)];

            if(onShelf == null)
                System.err.println("THE SHELF IS EMPTY");
        }
        catch (IndexOutOfBoundsException e){
            System.err.println("ERROR: NO SUCH SHELF!");
        }
        return onShelf;
    }

    // GET + SET
    public Thing take(String shelfName){
        Thing takenThing = whatIsOn(shelfName);

        if (takenThing != null) cabinetsShelves[getNumByName(shelfName)] = null;

        return takenThing;
    }

    private int getNumByName(String shelfName){
        switch (shelfName.toUpperCase()){
            case "TOPSHELF":
                return 0;
            case "MIDDLESHELF":
                return 1;
            case "BOTTOMSHELF":
                return 2;
            default:
                return -1;
        }
    }
}
