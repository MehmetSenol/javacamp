
package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckService;
import ödev4_1.Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager{
    private CustomerCheckService customerCheckService;

    public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
        this.customerCheckService = customerCheckService;
    }
    
    @Override
    public void save(Customer customer) {
       
        if (customerCheckService.checkIfRealPerson(customer)) {
            
            save(customer);
        }else{
            System.out.println("Not a valid Person");
        }
 
    }
    
    
}
