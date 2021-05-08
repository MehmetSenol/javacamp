
package ödev4_1.Entities;


import Abstract.Entity;


public class Customer implements Entity{
    public int ıd;
    public String firstName;
    public String lastName;
    public String dateOfBirth;
    public String nationalityId;

    public Customer() {
    }

    public Customer(int ıd, String firstName, String lastName, String dateOfBirth, String nationalityId) {
        this.ıd = ıd;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.nationalityId = nationalityId;
    }

    
   
}
