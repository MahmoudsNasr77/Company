package ban;
import java.util.*;
public class Ban {
    static Scanner s =new Scanner (System.in);
    public static void main(String[] args) throws Exception  {
        System.out.println("\t\t***********************");
        System.out.println("\t\t\tWelcome");
        System.out.println("\t\t***********************\n");
        System.out.println("Enter Your Name");
        String name =s.nextLine();
        System.out.println("Enter Your password");
        String password =s.nextLine();
        System.out.println("Enter Your id");
        String id =s.nextLine();
        System.out.println("Enter Your Email");
        String Email =s.nextLine();
        System.out.println("Enter Your blance");
        int blance=s.nextInt();
        Person b1=new Person(name,id,Email);
        BankAcc a1=new BankAcc(blance, b1, password);
        a1.addAccToOwner(b1);
        System.out.println("Enter 1 for deposit\n"
                + "Enter 2 For withdraw\n"
                + "Enter 3 For Print Blance\n"
                + "Enter 0 For Print Information\n ");
        int operation=s.nextInt();
        switch(operation){
            case 1:{
                System.out.println("Enter Amount of Depoist");
                int de=s.nextInt();
                a1.deposit(de);
                System.out.println("Depoist is Done ....");
                break;
            } 
            case 2:{
            System.out.println("Enter amount of Withdraw");
            int wi=s.nextInt();
            a1.withdraw(wi);
              System.out.println("Withdraw is Done ....");
                break;
             }
            
            case 3:{
                System.out.println("Blance = "+a1.getBlance());break;
                     }
            case 0:{
                System.out.println(a1.toString());
                break;
            }
                default:{
                    System.out.println("Wrong Number");
                    System.exit(0);
                }
        }
    }
}

        



        
        

