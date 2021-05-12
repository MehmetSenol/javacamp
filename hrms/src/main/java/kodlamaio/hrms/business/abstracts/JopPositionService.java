package kodlamaio.hrms.business.abstracts;

import kodlamaio.hrms.entities.concretes.JobPosition;

import java.util.List;

public interface JopPositionService {
    List<JobPosition> getAll();
}
