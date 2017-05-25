package ie.gmit.sw;

import java.util.ArrayList;

/**
 * Created by Sean on 20/05/2017.
 */
public class Event {

    private int id;
    private int x;
    private int y;
    private int distance;
    private ArrayList<Double> list;

    public Event(){

    }
    public Event(int id, int x, int y, int distance, ArrayList<Double> list ){
        this.id = id;
        this.x = x;
        this.y = y;
        this.distance = distance;
        this.list = list;

    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getDistane() {
        return distance;
    }

    public void setDistane(int distane) {
        this.distance = distane;
    }

    public ArrayList<Double> getList() {
        return list;
    }

    public void setList(ArrayList<Double> list) {
        this.list = list;
    }


    @Override
    public String toString() {
        return "Event{" +
                "id=" + id +
                ", x=" + x +
                ", y=" + y +
                ", distance=" + distance +
                ", list=" + list +
                '}';
    }
}
