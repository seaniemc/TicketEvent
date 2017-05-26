package ie.gmit.sw;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sean on 24/05/2017.
 */
public class EventList {


    //@SuppressWarnings("rawtypes")
    private List<Event> list  = new ArrayList<Event>();

    public boolean add(Event arg0) {
        return list.add(arg0);
    }

    public void clear() {
        list.clear();
    }

    public boolean contains(Object arg0) {

        return list.contains(arg0);
    }

    public Event getEvent(int index) {

        return list.get(index);
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public boolean remove(Object arg0) {
        return list.remove(arg0);
    }

    public int size() {
        return list.size();
    }

   public Object[] toArray() {
        return list.toArray();
   }


    }