package kodlamaio.hrms.business.abstracts;

import kodlamaio.hrms.core.DataResult;
import kodlamaio.hrms.core.Result;
import kodlamaio.hrms.entities.concretes.Employer;

import java.util.List;

public interface EmployerService {
    DataResult<List<Employer>> getAll();
    boolean checkMailActivation();
    boolean  checkUserActivationEmployee();
    Result add(Employer employer);
}
