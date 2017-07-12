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
        x = y = 0;
        String id;
        int dist = 0;

        for (int i = 0; i < 40; i ++){

            x = rand.nextInt(20) + 0;
            y = rand.nextInt(20) + 0;
           // id = rand.nextInt((100000 - 1000) + 1) + 1000;
            id = UUID.randomUUID().toString();
            ticketList = fillTickets();

            event = new Event(id, x, y,dist, ticketList);
            list.add(event);

        }
        //System.out.println(list.size());
        //System.out.println(Arrays.toString(list.toArray()));


        return list;
    }
    //eeeee
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
