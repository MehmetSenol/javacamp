package kodlamaio.hrms.core.adapters;

import java.time.LocalDate;


public interface UserCheckService {
    boolean checkIfRealPerson(String nationalIdentity, String firstName, String lastName, LocalDate birthDate);



}
