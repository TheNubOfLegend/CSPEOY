import java.io.Console;
import java.util.Scanner;
import java.util.*;

public class Car {
    //since we only make 4-wheel cars, our variable can be "static", meaning that the value is constant among instances
    private static int numOfWheels = 4;
    //here we promise that instances of the class "Car" will set a value to this "windows" variable
    private int numOfWindows;
    private String name;
    private String brand;

    public static void revEngine()
    {
        System.out.println("Vroom");
    }

    public static String[] drive()
    {
        Scanner console = new Scanner(System.in);
        System.out.println("You've come to an intersection! What would you like to do?");
        String[] directionOptionsBase = {"left", "right", "straight"};
        String[] directionOptions = new String[2];
        String d = console.nextLine();
        int directionChange0 = (int)(Math.ceil(Math.random()*3));
        int directionChange1 = (int)(Math.ceil(Math.random()*3));
        while (directionChange0 == directionChange1) {
            directionChange0 = (int)(Math.ceil(Math.random()*3));
        }

    }

    public static void Park() 
    {
        System.out.println("Parking... Thanks for the adventure!");
        exit()
    }

    //every car we make has 4 wheels, so we won't ever set wheels to any other value
    public int getWheels()
    {
        return numOfWheels;
    }

    public int getWindows()
    {
        return numOfWindows;
    }

    //this allows us to change the value in numOfWindows, and we indirectly do this to avoid using and potentially unintentionally changing the value of the variable in our code
    public void setWindows(int s)
    {
        this.numOfWindows = s;
    }

    public String getName()
    {
        return name;
    }

    public String getBrand()
    {
        return brand;
    }

    //this is a constructor, which is used as a template to create instances of a class.  It handles preliminary definition of class members (variables or functions)
    Car(int numOfWindows, String name, String brand) {
        this.numOfWindows = numOfWindows;
        this.name = name;
        this.brand = brand;
    }
}

