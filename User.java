import java.util.ArrayList; // to be used later on for creating an array list of users

class User implements IUser {
    private String userId;
    private String name;
    private String email;
    private String password;
    static ArrayList<User> users = new ArrayList<>();

    public User(String userId, String name, String email, String password){ //constructor to initialize userid, name, email, and password
        this.userId = userId;
        this.name = name;
        this.email = email;
        this.password = password;
    }
    
    //getters
    public String getUserId() { return userId; }
    public String getName() { return name; }
    public String getEmail() { return email; }
    public String getPassword() { return password; }
    
    //when registration is done successfully, a user is added to the users array list by the following command/method
    public static void addUser(User user) {
        users.add(user);
    }

    // method to check if user credentials were input correctly when user chooses to log in
    public static User validateLogin(String inputEmail, String inputPassword) {
        for (User u : users) {
            boolean emailMatch = u.getEmail().equals(inputEmail);
            boolean passMatch = u.getPassword().equals(inputPassword);

            if (emailMatch && passMatch) {
                System.out.println("Login successful!\n");
                return u;
            } else if (emailMatch) {
                System.out.println("Password is incorrect. Please try again.\n");
                return null;
            } else if (passMatch) {
                System.out.println("Email is incorrect. Please re-enter your email.\n");
                return null;
            }
        }
        System.out.println("Incorrect email and password. Please try again.\n");
        return null;
    }

    @Override
    public boolean login() { return true; }

    @Override
    public void logout() {}

    @Override
    public boolean register() { return true; }
}
