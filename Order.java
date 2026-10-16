import java.util.ArrayList;
import java.util.Date;

public class Order  { // Represents an order with ID, date, status, and a list of ordered menu items
    private String orderId; // Unique identifier for the order
    Date orderDate; // Date the order was placed
    private String status; // Current status of the order(ex:pending)
    ArrayList<MenuItem> items; // List of items in the order

    public Order(String orderId, Date orderDate) { // Constructor initializes order ID, date, and item list
        this.orderId = orderId;
        this.orderDate = orderDate;
        this.items = new ArrayList<>(); //items is now an array so anything added to arrayList is added to items
    }

    public String getOrderId() { // Returns the order ID
        return orderId;
    }
    
    public Date getOrderDate() {
        return orderDate;
    }
    
    public String getStatus(){
        return status;
    }
    
    
    public void setStatus(String s){
        status = s;
    }

    public void addItem(MenuItem item) { // Adds a menu item to the order
        items.add(item);
    }

    public void removeItem(MenuItem item) { // Removes a menu item from the order
        items.remove(item);
    }

    public float calculateTotal() { // Calculates and returns the total cost of all items in the order
        float total = 0;
        for (MenuItem item : items) {
            total += item.getPrice();
        }
        return total;
    }

}