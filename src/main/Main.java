package main;

import cabinet.*;
import things.*;

public class Main {
    public static void main(String[] args) {

        Cabinet cabinet = new Cabinet();
        cabinet.put( "topSelf", new Book("Programming in Java for beginners."));
        cabinet.put("middleShelf", new Cup("My lovely cup."));
        cabinet.put("bottomShelf", new Robot("R2D2"));

        Cup myLovelyCup = (Cup)cabinet.take("middleShelf");
        myLovelyCup.fill(true);
        cabinet.put("middleShelf", myLovelyCup);

        Robot r2d2 = (Robot)cabinet.take("bottomShelf");
        r2d2.charge(85);
        cabinet.put("bottomShelf", r2d2);

        System.out.println(cabinet.whatIsOn("topShelf"));
        System.out.println(cabinet.whatIsOn("middleShelf"));
        System.out.println(cabinet.whatIsOn("bottomShelf"));

    }
}
