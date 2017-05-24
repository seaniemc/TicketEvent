package ie.gmit.sw;

/**
 * Created by Sean on 20/05/2017.
 */
public class Event {

    private int id;
    private int x;
    private int y;
    private double distance;
    private double [] tickets ;

    public Event(){

    }
    public Event(int id, int x, int y, double distance, double [] tickets){
        this.id = id;
        this.x = x;
        this.y = y;
        this.distance = distance;
        this.tickets = tickets;
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

    public double getDistane() {
        return distance;
    }

    public void setDistane(double distane) {
        this.distance = distane;
    }

    public double[] getTickets() {
        return tickets;
    }

    public void setTickets(double[] tickets) {
        this.tickets = tickets;
    }
}
