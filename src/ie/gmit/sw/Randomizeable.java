package ie.gmit.sw;

import java.util.ArrayList;

/**
 * Created by Sean on 25/05/2017.
 */
public interface Randomizeable {
    //Generate random seed data for 20 event
    public EventList RandomEvent();

    //Method returns an array of random double numbers.
    ArrayList<Double> fillTickets();
}
