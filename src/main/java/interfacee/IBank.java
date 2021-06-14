
package interfacee;
import classs.Branch;
import java.util.ArrayList;

/**
 *
 * @author dannida
 */
public interface IBank {
    public boolean addBranch();
    public boolean addCustomer();
    public boolean addTransaction();
    public Branch findBranch();
    public boolean printCustomers();
     
}
