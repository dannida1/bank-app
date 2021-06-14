
package interfacee;

import classs.Customer;
import java.util.ArrayList;

/**
 *
 * @author dannida
 */
public interface IBranch {
    public String getName();
    public ArrayList<Customer> getCustomers();
    public boolean addCustomer();
     public boolean addTransaction();
      public Customer findCustomer();
     
}
