package kodlamaio.hrms.business.abstracts;

import kodlamaio.hrms.core.DataResult;
import kodlamaio.hrms.core.Result;
import kodlamaio.hrms.entities.concretes.JobPosition;

import java.util.List;

public interface JopPositionService {
    DataResult<List<JobPosition>> getAll();
    Result add(JobPosition jobPosition);
}
