package ie.gmit.sw;
//import ie.gmit.sw.Event;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

/**
 * Created by Sean on 20/05/2017.
 */
public class PopulateEvent implements Randomizeable {

    Random rand = new Random();
    private Event event;
    ArrayList<Event> list = new ArrayList<>();
    ArrayList<Double> ticketList = new ArrayList<Double>();
    //private EventList list;

    public PopulateEvent(){
        super();
    }

    //Generate random seed data for 20 event
    @Override
    public ArrayList<Event> RandomEvent(){
        //list = new EventList();
        int id, x, y;
        id = x = y = 0;
        int dist = 0;

        for (int i = 0; i < 20; i ++){

            x = rand.nextInt(20) + 0;
            y = rand.nextInt(20) + 0;
            id = rand.nextInt((100000 - 1000) + 1) + 1000;
            ticketList = fillTickets();

            event = new Event(id, x, y,dist, ticketList);
            list.add(event);

        }
        System.out.println(list.size());
        System.out.println(Arrays.toString(list.toArray()));


        return list;
    }

    //Method returns an array of random double numbers.
    @Override
    public ArrayList<Double> fillTickets(){
       ArrayList<Double> tickets = new ArrayList<>();
        Double randomValue = 0.0;

        for(int i =0; i < rand.nextInt(20) + 0; i++){
            randomValue = 5.0 + (250.00 - 5.0) * rand.nextDouble();
            tickets.add(randomValue);
        }
        return tickets;
    }


}
