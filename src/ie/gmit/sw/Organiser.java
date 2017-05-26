package ie.gmit.sw;

import java.util.*;

import static java.util.Comparator.comparingInt;
import static java.util.stream.Collectors.collectingAndThen;
import static java.util.stream.Collectors.toCollection;

/**
 * Created by Sean on 25/05/2017.
 */
public class Organiser {
    private Event event;
    //private EventList list;

    public Organiser(ArrayList<Event> list, int x, int y){
        CalculateManhatton(list,x,  y);
    }

    public ArrayList<Event> CalculateManhatton(ArrayList<Event> list,int x, int y){
        event = new Event();
        //list = new EventList();

        for(int i =0; i < list.size(); i++){
            event = list.get(i);

            event.setDistane( Math.abs(event.getX()-x) + Math.abs(event.getY()-y));

        }

        list = sortList(list);

        System.out.println(Arrays.toString(list.toArray()));
        return list;
    }

    public ArrayList<Event> sortList(ArrayList<Event> list){

        List<Event> unique = list.stream()
                .collect(collectingAndThen(toCollection(() -> new TreeSet<>(comparingInt(Event::getX))),
                        ArrayList::new));

        List<Event> unique1 = list.stream()
                .collect(collectingAndThen(toCollection(() -> new TreeSet<>(comparingInt(Event::getY))),
                        ArrayList::new));

        System.out.println(list.size());

//        Collections.sort(list, new Comparator<Event>() {
//            public int compare(Event one, Event other) {
//                return one.getDistane().compareTo(other.getDistane());
//            }
//        });
        return list;
    }


}
