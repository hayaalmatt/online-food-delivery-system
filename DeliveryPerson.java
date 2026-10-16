public class DeliveryPerson {
    private String deliveryId;  // Unique ID for the delivery person
    private String name;        // Name of the delivery person

    // Constructor
    public DeliveryPerson(String deliveryId, String name) {
        this.deliveryId = deliveryId;
        this.name = name;
    }

    // Assign an order to this delivery person
    public void assignOrder(Order order) {
        System.out.println("Order " + order.getOrderId() + " assigned to " + name);
    }

    // Update the status of an order
    public void updateStatus(Order order, String status) {
        order.setStatus(status); // You must define setStatus in Order class
        System.out.println("Order " + order.getOrderId() + " status updated to: " + status);
    }

    //Estimate delivery time based on distance in km
    public int estimateDeliveryTime(int distanceInKm) {
        // Assume average delivery speed is 40 km/h
        double timeInHours = (double) distanceInKm / 40;
        int timeInMinutes = (int) Math.round(timeInHours * 60);
        return timeInMinutes;
    }

    // Display delivery person's information
    public void displayInfo() {
        System.out.println("Delivery Person ID: " + deliveryId);
        System.out.println("Name: " + name);
    }

    // Getters
    public String getDeliveryId() {
        return deliveryId;
    }

    public String getName() {
        return name;
    }
}