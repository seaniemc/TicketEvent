package ie.gmit.sw;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Sean on 24/05/2017.
 */
public class EventRunner {


    public static void main(String[] args) {


        List<Event> list;
        PopulateEvent event = new PopulateEvent();
        list = event.RandomEvent();
        int userInput = 0;

       do{
            System.out.println("Please enter.....");
            System.out.println("1 to exit program");
            System.out.println("2 to retive tickets based on X and Y");
            Scanner scan = new Scanner(System.in);
            userInput = scan.nextInt();
            switch (userInput){
                case 1:

                    System.out.println("THANK YOU AND GOOD BYE");

                    break;

                case 2:

                    runTicketSearch(list);
            }

        } while(userInput != 1);


    }
    public static void runTicketSearch(List<Event> list){
        int[] intArray = usrInput();

        intArray = validInput(intArray[0], intArray[1]);

        Organiser org = new Organiser(list, intArray[0], intArray[1]);
    }
    public static int [] usrInput (){
        int[] intArray = new int[2];


        boolean input = true;

        do {
            Scanner scan = new Scanner(System.in);
            System.out.println("Please enter your X and Y coordinates..........");
            System.out.println("X is between 0 - 20");
            System.out.println("Y is between 0 - 20");
            try {
               int x = scan.nextInt();
                intArray[0] = x;
               int y = scan.nextInt();
                intArray[1] = y;

                input = false;
                // break;
            } catch (InputMismatchException e) {
                System.out.println("You did not enter numbers between 0 - 20");
                //input = false;
            }
        }while (input != false);
        return intArray;
    }
    public static int [] validInput(int x, int y){
        int[] intArray = new int[2];
        //boolean inputValidate = false;
        int min = 0;
        int max = 20;

        if((x >= min && x <= max )&& (y >= min && y <= max )){
            intArray[0] = x;
            intArray[1] = y;
        }else{
            System.out.println("Values are not in the correct range");
            usrInput();

        }
        return intArray;
    }

}
