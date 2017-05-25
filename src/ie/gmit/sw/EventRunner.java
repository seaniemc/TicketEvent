package ie.gmit.sw;

/**
 * Created by Sean on 24/05/2017.
 */
public class EventRunner {


    public static void main(String[] args) {
        EventList eventList = new EventList();
        PopulateEvent event = new PopulateEvent();

        eventList = event.RandomEvent();

        Organiser org = new Organiser(eventList,6, 5);

        
    }

}
