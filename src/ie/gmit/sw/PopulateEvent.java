package ie.gmit.sw;
//import ie.gmit.sw.Event;

import java.util.Arrays;
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

        int min = 100;
        int max = 1000;
        int randValue = 0;

        id = x = y = 0;
        double dist = 0.0;
        double [] tickets = new double[0];

        for (int i = 0; i < 20; i ++){
            x = rand.nextInt(20) + 0;
            y = rand.nextInt(20) + 0;
            id = rand.nextInt(20) + 0; //randValue = min + (max - min) * rand.nextInt();
            tickets = fillTickets();
            event = new Event(id, x, y,dist, tickets);
            list.add(event);

        }
        System.out.println(Arrays.toString(list.toArray()));
    }

    public double[] fillTickets(){
        double [] tickets = new double[20];
        double min = 5.0;
        double max = 250.00;
        double randomValue = 0.0;

        for(int i =0; i < tickets.length; i++){
            tickets[i] = randomValue = min + (max - min) * rand.nextDouble();
        }
        return tickets;
    }


}
