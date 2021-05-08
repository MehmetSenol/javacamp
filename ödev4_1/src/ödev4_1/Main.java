
package ödev4_1;

import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import ödev4_1.Entities.Customer;


public class Main {
    public static void main(String[] args) {
        BaseCustomerManager baseCustomerManager=new StarbucksCustomerManager(new MernisServiceAdapter());
        
        Customer customer1=new Customer(1, "Mehmet","senol", "2001", "123456789");
        Customer customer2 = new Customer(1, "ayşe","yagız", "2001", "123456789");
        baseCustomerManager.save(customer1);
        baseCustomerManager.save(customer2);
        
        BaseCustomerManager customerService2 = new NeroCustomerManager();

        Customer customer3 = new Customer(1, "Mehmet","senol", "2001", "123456789");
        customerService2.save(customer3);
        
    }
}
