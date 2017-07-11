package ie.gmit.sw;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.Comparator.comparingInt;
import static java.util.stream.Collectors.collectingAndThen;
import static java.util.stream.Collectors.toCollection;

/**
 * Created by Sean on 25/05/2017.
 */
public class Organiser {
    private Event event;

   // private

    public Organiser(ArrayList<Event> list, int x, int y){

        CalculateManhatton(list,x,  y);
    }


    public void CalculateManhatton(ArrayList<Event> list,int x, int y){
        event = new Event();
        //list = new EventList();

        for (Event aList : list) {
            event = aList;

            event.setDistane(Math.abs(event.getX() - x) + Math.abs(event.getY() - y));

        }

        sortList(list);

       // System.out.println(Arrays.toString(list.toArray()));
        //return list;
    }

    public List<Event> sortList(ArrayList<Event> list){

        List<Event> unique = list.stream()
                .collect(collectingAndThen(toCollection(() -> new TreeSet<>(comparingInt(Event::getX))),
                        ArrayList::new));
        List<Event> list1 = unique;

        List<Event> unique1 = list1.stream()
                .collect(collectingAndThen(toCollection(() -> new TreeSet<>(comparingInt(Event::getY))),
                        ArrayList::new));

        System.out.println(unique1.size());


        unique1.sort(Comparator.comparingInt(Event::getDistane));
        unique1 = sortPrice(unique1);
        unique1 = return5(unique1);

        System.out.println(Arrays.toString(unique1.toArray())+ '\n');

        return unique1;
    }

    public List<Event> sortPrice(List<Event> list){

       //list = new ArrayList<>();

        for(Event even: list){
            Collections.sort(even.getList());
        }
        //System.out.println(Arrays.toString(list.toArray())+ '\n');
        return list;
    }
    public List<Event> return5(List<Event>list){

        List<Event>resList = new ArrayList<>(list.subList(list.size() - 5, list.size()));
       //ArrayList<Double>onePrice = new ArrayList<>();
        int i = 0;
        for (Event even: resList){
            //even.getList().subList(even.getList().size()-1, even.getList().size());
            //onePrice.add(even.getList().get(0));
            ArrayList<Double>onePrice = new ArrayList<>(even.getList().subList(even.getList().size() -1, even.getList().size()));
            //resList);
            //onePrice.toString();
            //even.getList().replaceAll(onePrice);

        }
        //for
        return resList;
    }
}
