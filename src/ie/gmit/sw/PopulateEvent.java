package ie.gmit.sw;
//import ie.gmit.sw.Event;

import java.util.*;

/**
 * Created by Sean on 20/05/2017.
 */
public class PopulateEvent implements Randomizeable {

    Random rand = new Random();
    private Event event;
    List<Event> list = new ArrayList<>();
    ArrayList<Double> ticketList = new ArrayList<Double>();
    //private EventList list;

    public PopulateEvent(){

        super();
    }

    //Generate random seed data for 20 event
    @Override
    public List<Event> RandomEvent(){
        //list = new EventList();
        int x, y;
        String id;
        int dist = 0;

        for (int i = 0; i < rand.nextInt(100000000) + 50; i ++){

            x = rand.nextInt(20) + 0;
            y = rand.nextInt(20) + 0;
            id = UUID.randomUUID().toString();
            ticketList = fillTickets();

            event = new Event(id, x, y,dist, ticketList);
            list.add(event);

        }

        return list;
    }

    //Method returns an ArrayList of random double numbers.
    @Override
    public ArrayList<Double> fillTickets(){
       ArrayList<Double> tickets = new ArrayList<>();
        Double randomValue;

        for(int i = 0; i < rand.nextInt(20) + 1; i++){
            randomValue = 5.0 + (250.00 - 5.0) * rand.nextDouble();
            tickets.add(randomValue);
        }
        return tickets;
    }


}
