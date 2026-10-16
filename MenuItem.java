public class MenuItem { // Represents a single menu item with an ID, name, and price
    private String itemId; //  identifier for the menu item
    private String name; // Name of the menu item
    private float price; // Price of the menu item

    public MenuItem(String itemId, String name, float price) { // Constructor initializes the item's ID, name, and price
        this.itemId = itemId;
        this.name = name;
        this.price = price;
    }

    public float getPrice() { // Returns the price of the menu item
        return price;
    }

    public String getName() { // Returns the name of the menu item
        return name;
    }
    
    public String getitemId(){ // Returns the ID of the menu item
        return itemId;
    }
    
    public String DisplayItem(){
        return getName() + "    " + getPrice() + "SAR";
    }
    
}