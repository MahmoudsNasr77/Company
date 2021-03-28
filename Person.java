package ban;
import java.util.ArrayList;
public class Person {
    String name,ID,Email;
    ArrayList<Account> Accounts =new ArrayList<Account>();

    public Person(String name, String ID, String Email) {
        this.name = name;
        this.ID = ID;
        this.Email = Email;
        
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getID() {
        return ID;
    }
    public void setID(String ID) {
        this.ID = ID;
    }
    public String getEmail() {
        return Email;
    }
    public void setEmail(String Email) {
        this.Email = Email;
    }
    public ArrayList<Account> getA1() {
        return Accounts;
    }
    public void setA1(ArrayList<Account> a1) {
        this.Accounts = a1;
    }
       
    @Override
    public String toString() {
        return   name + "\nID=" + ID + "\nEmail=" + Email ;
    }
    
    
}
