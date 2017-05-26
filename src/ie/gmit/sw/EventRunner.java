package ie.gmit.sw;

import java.util.ArrayList;

/**
 * Created by Sean on 24/05/2017.
 */
public class EventRunner {


    public static void main(String[] args) {
        //EventList eventList = new EventList();
        ArrayList <Event> list = new ArrayList<Event>();
        PopulateEvent event = new PopulateEvent();

       list = event.RandomEvent();

        Organiser org = new Organiser(list,6, 5);


    }

}
