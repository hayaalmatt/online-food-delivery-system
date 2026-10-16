import java.util.ArrayList;
public class Restaurant {
    private String restaurantId;
    private String name;
    private String address;
    private ArrayList<MenuItem> menu = new ArrayList<>();
    private ArrayList<Restaurant> restaurants = new ArrayList<>();
    
    public Restaurant(String restaurantId,String name,String address){
        this.restaurantId = restaurantId;
        this.name = name;
        this.address = address;
        this.menu = new ArrayList<>();
        
    }
    
    public void addMenuItem(MenuItem item){
        menu.add(item);
        }
        
    
    public void removeMenuItem(String itemId){
        for(int i = 0; i<menu.size();i++){
            if(menu.get(i).getitemId().equals(itemId))
                menu.remove(i);
            
        }
    }
    
    public String getRestaurantId(){
        return restaurantId;
    }
    
    public String getName(){
        return name;
    }
    
    public String getAddress(){
        return address;
    }
    
    public ArrayList<MenuItem> getMenuItems(){
        return new ArrayList<>(menu);
    }
    
    public void displayMenu() {
        for (int i = 0;i<menu.size();i++) {
            System.out.println((i+1) + "- " + menu.get(i).DisplayItem());
        }
    }
    
    public String DisplayRestaurant(){
            return "======== " + name + " ========" +
                    "\nID: " + restaurantId + 
                    "\nAddress: " + address;
        }
    }
    
