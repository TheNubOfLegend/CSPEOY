import java.io.Console;

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
        Console console = System.console();
        System.out.println("You've come to an intersection! What would you like to do?");
        String[] directionOptions = 
        String direction = console.readLine();
        int directionChange1 = (Math.ceil(Math.random()*3)).parseInt()
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

