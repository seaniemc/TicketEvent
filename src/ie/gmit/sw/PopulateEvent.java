package ie.gmit.sw;
//import ie.gmit.sw.Event;

import java.util.Random;

/**
 * Created by Sean on 20/05/2017.
 */
public class PopulateEvent  {
    Random rand = new Random();
    private Event event;
    private EventList list;

    public PopulateEvent(){
        super();
    }

    //Generate random seed data for 20 event
    public void RandomEvent(){
        list = new EventList();
        int id, x, y;
        id = x = y = 0;
        double dist = 0.0;
        double [] tickets = new double[0];

        for (int i = 0; i < 20; i ++){
            x = rand.nextInt(20) + 0;
            y = rand.nextInt(20) + 0;
            id = rand.nextInt(1000) + 100;
            event = new Event(id, x, y,dist, tickets);
            list.add(event);
        }

    }

    public double[] fillTickets(){
        double [] tickets = new double[0];

        for(int i =0; i < rand.nextInt(20)+ 1; i++){
            
        }
        return tickets;
    }


}
