import java.util.Scanner;
import java.util.Random;
import java.util.Date;
import java.util.ArrayList;
//import java.utils such as Scanner for input, Random for generating random numbers, 
//Date for generating a date, and ArrayList for the array lists used in the code
public class Test {
    public static void main(String[] args) {
        //create a scanner for reading the user's inputs
        Scanner input = new Scanner(System.in);
        //create an array list for the user's cart
        ArrayList<MenuItem> cart = new ArrayList<>();
        Random random = new Random(); //created for generating random numbers to be used later on in code
        User currentUser = null; //initialize the currentUser variable for later use in if/elif statements

        User.addUser(new User("65432", "Haya", "halmatt@alfaisal.edu", "123456"));
        
        System.out.println("Welcome to the Online Delivery System!");
        System.out.println("1. Login" + "\n2. Register");
        System.out.print("Enter your choice: ");
        int choice = input.nextInt(); //variable for user's choice is created
        input.nextLine(); // Consume newline

        // Basic login/register simulation
        if (choice == 1) {
             while (true) {
                System.out.print("Enter email: ");
                String email = input.nextLine();
                System.out.print("Enter password: ");
                String password = input.nextLine();

                currentUser = User.validateLogin(email, password);
                if (currentUser != null) {
                    break; // login successful
                }
            }
            
            
        } else if (choice == 2) {
            System.out.print("Enter name: ");
            String name = input.nextLine();
            System.out.print("Enter email: ");
            String email = input.nextLine();
            System.out.print("Enter password: ");
            String password = input.nextLine();
            currentUser = new User("54321", name, email, password);
            User.addUser(currentUser); // store the new user 
            System.out.println("Registration successful!\n");
        }

        // Create restaurants and menus
        ArrayList<Restaurant> restaurants = new ArrayList<>();
        
        Restaurant BanaBakery = new Restaurant("000000", "Bana's Bakery", "Al Olaya, Musa Ibn Nusair St");
        BanaBakery.addMenuItem(new MenuItem("0001", "Chocolate Chip Cookie", 2.50f));
        BanaBakery.addMenuItem(new MenuItem("0002", "Croissant", 2.75f));
        BanaBakery.addMenuItem(new MenuItem("0003", "Cheesecake", 4.50f));
        BanaBakery.addMenuItem(new MenuItem("0004", "Carrot Cake", 5.00f));
        BanaBakery.addMenuItem(new MenuItem("0005", "Vanilla Cupcakes", 3.00f));

        Restaurant SafaSalad = new Restaurant("111111", "Safa's Salads", "Al Sulaymaniyah, Riyadh 12221");
        SafaSalad.addMenuItem(new MenuItem("1111", "Greek salad", 9f));
        SafaSalad.addMenuItem(new MenuItem("1112", "Chicken salad", 11f));
        SafaSalad.addMenuItem(new MenuItem("1113", "Fruit salad", 6f));
        SafaSalad.addMenuItem(new MenuItem("1114", "Italian salad", 8f));
        SafaSalad.addMenuItem(new MenuItem("1115", "Shrimp salad", 12f));

        Restaurant RazanRamen = new Restaurant("222222", "Razan's Ramen", "Al Malaz, Riyadh 12642");
        RazanRamen.addMenuItem(new MenuItem("2221", "Vegetable Ramen", 9.00f));
        RazanRamen.addMenuItem(new MenuItem("2222", "Chicken Ramen", 10.00f));
        RazanRamen.addMenuItem(new MenuItem("2223", "Beef Ramen", 10.50f));
        RazanRamen.addMenuItem(new MenuItem("2224", "Shrimp Ramen", 11.00f));
        RazanRamen.addMenuItem(new MenuItem("2225", "Curry Ramen", 10.75f));

        Restaurant JoudJuice = new Restaurant("333333", "Joud and the Juice", "Al Hamra, Riyadh 13216");
        JoudJuice.addMenuItem(new MenuItem("3331", "Watermelon Juice", 4.00f));
        JoudJuice.addMenuItem(new MenuItem("3332", "Mango Juice", 4.25f));
        JoudJuice.addMenuItem(new MenuItem("3333", "Apple Juice", 3.75f));
        JoudJuice.addMenuItem(new MenuItem("3334", "Orange Juice", 4.00f));
        JoudJuice.addMenuItem(new MenuItem("3335", "Lemon Juice", 3.50f));
        
        CreditCardPayment c = new CreditCardPayment("657568", 10000, "10987654321");

       
        //Create instances for the restaurant
        restaurants.add(BanaBakery);
        restaurants.add(SafaSalad);
        restaurants.add(RazanRamen);
        restaurants.add(JoudJuice);

        // Display restaurant names
        System.out.println("Available restaurants:");
        for (int i = 0; i < restaurants.size(); i++) {
            System.out.println((i + 1) + ". " + restaurants.get(i).getName());
        }

        // Prorgram gives user the option to chooses a restaurant
        System.out.print("Choose a restaurant (1-4): ");
        int restChoice = input.nextInt();
        input.nextLine();
        
        // User's selected restaurant's menu is displayed
        Restaurant selectedRestaurant = restaurants.get(restChoice - 1);
        System.out.println(selectedRestaurant.DisplayRestaurant());
        System.out.println("\nMenu:");
        selectedRestaurant.displayMenu();

        // Program prompts user to add items to cart
        while (true) {
            System.out.print("Enter item number to add to cart or 0 to finish: ");
            int itemChoice = input.nextInt();
            if (itemChoice == 0) 
            break;
            cart.add(selectedRestaurant.getMenuItems().get(itemChoice - 1));
        }

        String orderId = "" + (random.nextInt(10000)); //  a random id is generated for the order id
        Order order = new Order(orderId, new Date()); // an order date is generated
        for (MenuItem item : cart) {
            order.addItem(item); //
        }
        order.setStatus("Pending");

        while (true) {
            displayOrderSummary(order);
            System.out.println("1. Checkout\n2. Edit Order"); //program prompts user to either proceed to checkout or edit order
            int option = input.nextInt();
            input.nextLine();

            System.out.println("----------------------");
            
            if (option == 1){  //user wants to check out
                Location location = new Location();
                location.chooseLocation(restChoice);
                
                System.out.println("Total to pay: " + order.calculateTotal() + " SAR"); //order total is calculated
                System.out.print("Enter your card number: ");
                String card = input.nextLine(); //card number is collected from user
                CreditCardPayment payment = new CreditCardPayment("PAY" + random.nextInt(1000), order.calculateTotal(), card);
                payment.processPayment();
                DeliveryPerson delivery = new DeliveryPerson("D100", "Haya Al-Matt"); //instance for deliveryPerson
                order.setStatus("Out for Delivery");

                // Receipt
                System.out.println("\n===== ORDER RECEIPT =====");
                displayOrderSummary(order);
                System.out.println("Delivery Info:");
                delivery.displayInfo(); //delivery info is displayed for user
               
                System.out.println("===========================");
                
                Review review = new Review();
                review.askForReview(); //program asks user if they'd like to leave a review
                break;

            } else if (option == 2) { //user wants to edit order
                System.out.println("1. Add Item\n2. Remove Item"); //program prompts the user to add/remove an item
                int editOption = input.nextInt();
                input.nextLine();

                if (editOption == 1) {
                    selectedRestaurant.displayMenu();
                    System.out.print("Enter item number to add: ");
                    int add = input.nextInt();
                    cart.add(selectedRestaurant.getMenuItems().get(add - 1));
                    order.addItem(selectedRestaurant.getMenuItems().get(add - 1)); //addItem method is referenced from order class
                    
                } else if (editOption == 2) {
                    for (int i = 0; i < cart.size(); i++) {
                        System.out.println((i + 1) + ". " + cart.get(i).getName());
                    }
                    System.out.print("Enter item number to remove: ");
                    int remove = input.nextInt();
                    MenuItem toRemove = cart.get(remove - 1);
                    cart.remove(toRemove);
                    order.removeItem(toRemove); //removeItem method is called
                }
            }
        }
    }

    public static void displayOrderSummary(Order order) { //method for displaying order summary
        System.out.println("--------------------------");
        System.out.println("Order ID: " + order.getOrderId());
        System.out.println("Date: " + order.orderDate);
        System.out.println("Status: " + order.getStatus());
        System.out.println("Items:");
        for (MenuItem item : order.items) {
            System.out.println("- " + item.getName() + ": " + item.getPrice() + "SAR");
        }
        System.out.println("Total: " + order.calculateTotal() + "SAR");
        System.out.println("=========================");
        
    }
}
