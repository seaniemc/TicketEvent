package ie.gmit.sw;

import java.text.NumberFormat;
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

    public Organiser(List<Event> list, int x, int y){
        CalculateManhatton(list,x,  y);
    }

    //method calculates the manhattan distance between the users
    //coordinates and each event
    public void CalculateManhatton(List<Event> list,int x, int y){
        event = new Event();

        for (Event aList : list) {
            event = aList;
            event.setDistane(Math.abs(event.getX() - x) + Math.abs(event.getY() - y));
        }
        sortList(list);
    }

    public List<Event> sortList(List<Event> list){

        //removes any duplicates for any event at each X coordinate
        List<Event> unique = list.stream()
                .collect(collectingAndThen(toCollection(() ->
                                new TreeSet<>(comparingInt(Event::getX))),
                        ArrayList::new));

        List<Event> list1 = unique;

        //removes any duplicates for any event at each Y coordinate
        List<Event> unique1 = list1.stream()
                .collect(collectingAndThen(toCollection(()
                                -> new TreeSet<>(comparingInt(Event::getY))),
                        ArrayList::new));

        System.out.println(unique1.size());

        //sorts the list based om distance
        unique1.sort(Comparator.comparingInt(Event::getDistane));
        //passes the list which gets sorted by price in ascending order
        unique1 = sortPrice(unique1);

        //creates a sublist of the 5 closest events
        List<Event>resList = new ArrayList<>(unique1.subList(0,5));

        //System.out.println(Arrays.toString(resList.toArray())+ '\n');
        showResult(resList);

        return resList;
    }
    //method sorts the list of prices in each object by from low to high
    public List<Event> sortPrice(List<Event> list){

        for(Event even: list){
            Collections.sort(even.getList());
        }
        return list;
    }


    public void showResult(List<Event>list){
        double amount = 0.00;
        Locale locale = new Locale("en", "US");
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(locale);

        System.out.println("=======List of the five closest events with Lowest price for each event========");
        System.out.println("");
        System.out.printf("%-40s %-10s %-10s %-10s %-10s\n", "ID", "X", "Y", "Dist", "Price");

        for (Event eve: list){
            amount = eve.getList().get(0);
            System.out.printf("%-40s %-10s %-10s %-10s %-10s\n", eve.getId(), eve.getX(), eve.getY(), eve.getDistane(), currencyFormatter.format(amount));

        }
    }
}
