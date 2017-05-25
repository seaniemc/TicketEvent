package ie.gmit.sw;

import java.util.Arrays;

/**
 * Created by Sean on 25/05/2017.
 */
public class Organiser {
    private Event event;
    //private EventList list;

    public Organiser(EventList list, int x,int y){
        CalculateManhatton(list,x,  y);
    }

    public EventList CalculateManhatton(EventList list,int x, int y){
        event = new Event();
        //list = new EventList();

        for(int i =0; i < list.size(); i++){
            event = list.getEvent(i);

            event.setDistane( Math.abs(event.getX()-x) + Math.abs(event.getY()-y));

        }
        System.out.println(list.size());
        System.out.println(Arrays.toString(list.toArray()));
        return list;
    }



}
