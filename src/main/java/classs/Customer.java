
package classs;
import interfacee.ICustomer;
import java.util.ArrayList;

/**
 *
 * @author dannida
 */
public class Customer implements ICustomer{
      private String name;
    private ArrayList<Double> transactions;


    public Customer(String name, double initialTransaction) {
        this.name = name;
        this.transactions = new ArrayList<Double>();
        addTransaction(initialTransaction);
    }

    public void addTransaction(double amount) {
        this.transactions.add(amount);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }    

    @Override
    public void addTransaction() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
