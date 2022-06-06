import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        //initialize an instance of "Car" named "HondaAccord", which has 6 windows, is named "Accord", and has a brand name "Honda"
        Car HondaAccord = new Car(6, "Accord", "Honda");
        Car ChevyMalibu = new Car(10, "Malibu", "Chevy");
        System.out.println("Name of car: " + HondaAccord.getName() + "\nNumber of windows: " + HondaAccord.getWindows());
        System.out.println("Name of car: " + ChevyMalibu.getName() + "\nNumber of windows: " + ChevyMalibu.getWindows());


        //set the Accord's number of windows to 8
        HondaAccord.setWindows(8);
        System.out.println("Name of car: " + HondaAccord.getName() + "\nNumber of windows: " + HondaAccord.getWindows());

        //the Malibu's window number stayed the same
        System.out.println("Name of car: " + ChevyMalibu.getName() + "\nNumber of windows: " + ChevyMalibu.getWindows());

        while (true) {
            System.out.println("What would you like to do : 'rev' your engine, 'drive', or 'park'?");
            Scanner console = new Scanner(System.in);
            String in = console.nextLine();
            in = in.replaceAll("\\\\n","");
            if (in == "rev") {
                Car.revEngine();
            } else if (in == "drive") {
                Car.drive();
            } else if (in == "park") {
                Car.Park();
            } else {
                System.out.println("Invalid input. Try again.");
                System.out.println(in);
                System.out.print(in == "rev");
            }
        }
    }
}
