
package Adapters;

import Abstract.CustomerCheckService;
import java.rmi.RemoteException;

import ödev4_1.Entities.Customer;



public class MernisServiceAdapter implements CustomerCheckService{

    @Override
    public boolean checkIfRealPerson(Customer customer) {
       boolean result = false;
        try {
            //result = client.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityID()),customer.getFirstName(),customer.getLastName(), customer.getDateOfBirth().getYear());
        }
        catch (NumberFormatException e){
            e.printStackTrace();
        }
       
        return result;
    }
    
}
