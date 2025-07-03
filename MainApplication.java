public class MainApplication {
    public static void main(String[] args) {
        Admin curAdmin = new Admin(1234, "Stephan", "xa1@LW42%3");
        User curUser = new User(4455, "John");

        curAdmin.performOperation(new Update()); // Admin Updates the data.
        curUser.performOperation(new View()); // User can view the data.
    }
}

/*
 * TAKEAWAYS;
 * Key Concepts Used:
 * Inheritance: Admin and User inherit from Account.
 * 
 * Polymorphism: Different DataSource implementations are treated uniformly.
 * 
 * Strategy Pattern: Operations (strategies) can be swapped at runtime.
 * 
 * Encapsulation: Fields are protected/private, accessed through methods.
 * 
 * Abstraction: Account is abstract, DataSource is an interface.
 * 
 * Flow of Execution:
 * MainApplication creates Admin and User objects.
 * 
 * When performOperation() is called:
 * The passed DataSource implementation is stored
 * Its execute() method is called
 * 
 * Output will be:
 * Data has been Updated Successfully!
 * Some data to be displayed.
 * 
 * This design allows flexible addition of new operations (just implement
 * DataSource)
 * without modifying existing account classes - following the Open/Closed
 * Principle.
 */
