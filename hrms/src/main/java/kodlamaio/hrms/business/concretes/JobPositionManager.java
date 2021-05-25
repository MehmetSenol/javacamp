package kodlamaio.hrms.business.concretes;

import kodlamaio.hrms.business.abstracts.JobPositionService;
import kodlamaio.hrms.core.utilities.*;
import kodlamaio.hrms.dataAccess.abstracts.JobPositionDao;
import kodlamaio.hrms.entities.concretes.JobPosition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobPositionManager implements JobPositionService {

    private JobPositionDao jobPositionDao ;

    @Autowired
    public JobPositionManager(JobPositionDao jobPositionDao) {
        this.jobPositionDao = jobPositionDao;
    }

    @Override
    public DataResult<List<JobPosition>> getAll() {
        return new SuccessDataResult<>(this.jobPositionDao.findAll(),"Data Listelendi");
    }

    @Override
    public Result add(JobPosition jobPosition) {
        if (jobPositionDao.findAllByPosition(jobPosition.getPosition()).stream().count()!=0){
            return new ErrorResult("Aynı İsimde İş Pozisyonu Kullanılamaz");
        }else{
            jobPositionDao.save(jobPosition);
            return new SuccessResult(("Başarılı Bir Şekilde Sisteme Eklendi"));
        }


    }
}
