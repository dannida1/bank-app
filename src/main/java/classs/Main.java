
package classs;

/**
 *
 * @author dannida
 */
public class Main {
    public static void main(String[] args) {
        
        Bank bank = new Bank();
        bank.addBranch("Adelaide");
        bank.addCustomer("Adelaide", "Tim Zimmer", 50.05);
        bank.addCustomer("Adelaide", "Mike Dehar", 175.34);
        bank.addCustomer("Adelaide", "Percy Brown", 220.12);


        bank.addTransaction("Adelaide", "Tim Zimmer", 44.22);
        bank.addTransaction("Adelaide", "Mike Dehar", 175.34);
        bank.addTransaction("Adelaide", "Percy Brown", 1.65);
        
        bank.printCustomers("Adelaide", true);

        /*
        bank.addBranch("Frankfurt Am Main");
        bank.addCustomer("Frankfurt Am Main", "Hans Mustermann", 200.00);
        */

       
          /*
        System.out.println("Error checks:");
      
        bank.addCustomer("Frankfurt Am Main", "Hans Mustermann", 100.00);
        bank.addTransaction("Frankfurt Am Main", "Tomas Mayer", -100.00);
        bank.addBranch("Frankfurt Am Main");
        bank.addCustomer("Hamburg", "Hans Mustermann", 200.00);
        */
    }    
}
