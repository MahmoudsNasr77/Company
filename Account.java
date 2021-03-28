package ban;
public abstract class Account {
    private Person owner ;
   private String password;
   static int numberOfAccount=0;
    public Account() {
    }
    public Account(Person owner, String password) {
        this.owner = owner;
        this.password = password;
        numberOfAccount++;
    }
   
    public abstract void addAccToOwner(Person p1);
    
    public Person getOwner() {
        return owner;
    }
    public void setOwner(Person owner) {
        this.owner = owner;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    } 
    @Override
    public String toString() {
        return "Number Of Account "+numberOfAccount+"\nName= "+owner + "\npassword=" + "************";
    }
}
