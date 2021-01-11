import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Person {
    //StringProperty=abstract type of object
    private StringProperty firstName = new SimpleStringProperty(this, "firstName", "");

    //Return the StringProperty object
    public StringProperty firstNameProperty(){
        return firstName;
    }

    //Return the firstName value (ie. "Bucky)
    public String getFirstName(){
        return firstName.get();
    }

    //Set the firstName value
    public void setFirstName(String firstName) {
        this.firstName.set(firstName);
    }
}
