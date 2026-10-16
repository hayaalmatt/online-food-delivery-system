// Class to process credit card payments and extends Payment
public class CreditCardPayment extends Payment {
    private String cardNumber;

    //constructor to initialize card payment
    public CreditCardPayment(String paymentId, float amount, String cardNumber) {
        super(paymentId, amount); // Call parent constructor
        this.cardNumber = cardNumber;
    }

    // method to simulate processing the payment
    @Override
    public boolean processPayment() {
        // For simplicity, we assume the payment always succeeds
        System.out.println("Processing payment using credit card ending in " + getLast4Digits());
        System.out.println("Payment of " + amount + " SAR successful.");
        return true;
    }

    // return last 4 digits of card for confirmation
    private String getLast4Digits() {
        if (cardNumber.length() >= 4) {
            return cardNumber.substring(cardNumber.length() - 4);
        } else {
            return "";
        }
    }

    // shows extra card info
    public void displayCardInfo() {
        System.out.println("Card used: **** **** **** " + getLast4Digits());
    }
}