
package Concrete;

import Abstract.CustomerCheckService;
import ödev4_1.Entities.Customer;


public class CustomerCheckManager implements CustomerCheckService{

    @Override
    public boolean checkIfRealPerson(Customer customer) {
        return true;
    }
    
}
