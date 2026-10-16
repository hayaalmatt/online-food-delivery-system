import java.util.Scanner;

public class Review {
    public void askForReview() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Your order has been delivered.");
        System.out.print("Would you like to leave a review? (yes/no): ");
        String answer = scanner.nextLine().trim().toLowerCase(); //converts user's full input to lowercase incase user writes in any uppercase

        if (answer.equals("no")) {
            System.out.println("Thank you for ordering with us!");
        } else if (answer.equals("yes")) {
            System.out.print("From 1 to 5, how would you rate the service? ");
            int rating = scanner.nextInt();

            if (rating >= 1 && rating <= 5) {
                System.out.print("Your rating: ");
                for (int i = 1; i <= 5; i++) {
                    if (i <= rating) {
                        System.out.print("*");
                    } 
                    
                    
                }
                System.out.println(); 
            } else {
                System.out.println("Invalid rating.");
            } 
        } else {
            System.out.println("Invalid input.");
        }
        
    }
}
