package kodlamaio.hrms.business.abstracts;

import kodlamaio.hrms.core.utilities.DataResult;
import kodlamaio.hrms.core.utilities.Result;
import kodlamaio.hrms.entities.concretes.JobPostings;

import java.util.List;


public interface JobPostingsService {
    Result add(JobPostings jobPostings);
    Result activePosting(int id);
    DataResult<List<JobPostings>> getByisActivateTrue();
    DataResult <List<JobPostings>> getByisActivateTrueAndEmployer_CompanyName(String companyName);
    DataResult<List<JobPostings>> getByisActivateTrueOrderByCreatedDate();



}
