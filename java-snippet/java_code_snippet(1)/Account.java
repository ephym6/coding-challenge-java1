abstract public class Account {
    /*
     * abstract: This means the class cannot be instantiated directly,
     * only extended by subclasses
     */

    protected int id; // accessible by subclasses
    protected String name; // accessible by subclasses
    public DataSource myData; // Only accessible within Account class

    public void performOperation(DataSource myData) { // takes a DataSource object and executes it
        this.myData = myData;
        myData.execute();
    }
}
