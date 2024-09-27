import java.util.*;

public class HomeApp {
    public static void main(String[] args) {

        HomeService light = new Light();
        HomeService tv = new Tv();
        HomeService airConditioning = new AirConditioning();

        HomeInterface homeInterface = new HomeInterface(light, tv, airConditioning);

        Scanner keyboard = new Scanner(System.in);

        while (true) {

            displayMenu();
            int option = keyboard.nextInt();
            homeInterface.controlServices(option);
            System.out.println();
        }
        
    }

    private static void displayMenu() {

        System.out.println("\nHome Control App\n");
        System.out.println("1. Turn on Light");
        System.out.println("2. Turn off Light");
        System.out.println("3. Turn on TV");
        System.out.println("4. Turn off TV");
        System.out.println("5. Turn on Air Conditioning");
        System.out.println("6. Turn off Air Conditioning");
        System.out.println("7. Turn on All");
        System.out.println("8. Turn off All");
        System.out.println("9. Exit");
        System.out.print("Select an option: ");
    }

}