
interface IUser {
    boolean login(); // returns true if login was successful and false if not
    void logout(); // method is declared void as it is a simple action
    boolean register(); // returns true at all times when registration is successful
}
