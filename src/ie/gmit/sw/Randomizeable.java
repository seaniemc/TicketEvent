package ie.gmit.sw;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sean on 25/05/2017.
 */
public interface Randomizeable {
    //Generate random seed data for 20 event
    List RandomEvent();

    //Method returns an array of random double numbers.
    List<Double> fillTickets();
}
