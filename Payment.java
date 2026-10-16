// Abstract class that stores payment details for an order
public abstract class Payment {
    protected String paymentId;
    protected float amount;

    // Constructor to initialize payment ID and amount
    public Payment(String paymentId, float amount) {
        this.paymentId = paymentId;
        this.amount = amount;
    }

    // abstract method for processing payment
    public abstract boolean processPayment();

    // payment summary
    public void displayPaymentDetails() {
        System.out.println("Payment ID: " + paymentId);
        System.out.println("Amount: " + amount + " SAR");
    }

    // Getters
    public String getPaymentId() {
        return paymentId;
    }

    public float getAmount() {
        return amount;
    }
}