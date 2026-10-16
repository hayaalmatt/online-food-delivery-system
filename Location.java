import java.util.Scanner;

public class Location { //class to display for user estimated delivery time
    private int userLocation;

    public void chooseLocation(int restaurantChoice) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select your region: ");
        System.out.println("1. Rabwa\n2. Sulaymaniyah\n3. Malaz\n4. Hamra");
        System.out.print("Enter 1-4: ");
        userLocation = scanner.nextInt();

        System.out.print("Estimated delivery time: ");
        switch (userLocation) {
            case 1: // Rabwa
                switch (restaurantChoice) {
                    case 1: System.out.println("30-35 min"); break;
                    case 2: System.out.println("20-25 min"); break;
                    case 3: System.out.println("15-20 min"); break;
                    case 4: System.out.println("25-30 min"); break;
                    default: System.out.println("Invalid restaurant."); break;
                }
                break;

            case 2: // Sulaymaniyah
                switch (restaurantChoice) {
                    case 1: System.out.println("15-20 min"); break;
                    case 2: System.out.println("10-15 min"); break;
                    case 3: System.out.println("20-25 min"); break;
                    case 4: System.out.println("30-35 min"); break;
                    default: System.out.println("Invalid restaurant."); break;
                }
                break;

            case 3: // Malaz
                switch (restaurantChoice) {
                    case 1: System.out.println("25-30 min"); break;
                    case 2: System.out.println("20-25 min"); break;
                    case 3: System.out.println("10-15 min"); break;
                    case 4: System.out.println("15-20 min"); break;
                    default: System.out.println("Invalid restaurant."); break;
                }
                break;

            case 4: // Hamra
                switch (restaurantChoice) {
                    case 1: System.out.println("30-35 min"); break;
                    case 2: System.out.println("25-35 min"); break;
                    case 3: System.out.println("15-20 min"); break;
                    case 4: System.out.println("10-15 min"); break;
                    default: System.out.println("Invalid restaurant."); break;
                }
                break;

            default:
                System.out.println("Invalid location.");
        }
        
        System.out.println("--------------------");
    }
}
