package ban;

import java.util.ArrayList;



public class BankAcc extends Account implements Banking {
    private double blance;
    public BankAcc(double blance, Person owner, String password) {
        super(owner, password);
        addAccToOwner(owner);
        this.blance = blance;
       owner.Accounts.add(this);
    }
      public  void addAccToOwner(Person p1){
          p1.Accounts.add(this);
      }
      public void deposit (double amount ){
          if (amount>0){
              blance+=amount;
          }
          else{
              System.out.println("Add Amount");
          }
      }
      public void withdraw(double amount ){
          if (blance>0&&amount<=blance){
              blance-=amount;
          }
          else {
              System.out.println("Sorry Process Filed :(");
          }
              
      }
public void transferTo(BankAcc b1, double x) {
    if (x <= blance) {
        withdraw(x);
        b1.deposit(x);
        System.out.println("\nTransfer succesful. Tansfered:" + b1.getBlance());
    } else {
        System.out.println("\nTransfer failed, not enough balance!");
    }
}
    public double getBlance() {
        return blance;
    }                

    @Override
    public String toString() {
        return super.toString()+ "\nblance=" + blance ;
    }
      
    
}
