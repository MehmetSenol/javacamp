package kodlamaio.hrms.business.concretes;

import kodlamaio.hrms.business.abstracts.JopPositionService;
import kodlamaio.hrms.core.*;
import kodlamaio.hrms.dataAccess.abstracts.JopPositionDao;
import kodlamaio.hrms.entities.concretes.JobPosition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JopPositionManager implements JopPositionService {

    private JopPositionDao jopPositionDao ;

    @Autowired
    public JopPositionManager(JopPositionDao jopPositionDao) {
        this.jopPositionDao = jopPositionDao;
    }

    @Override
    public DataResult<List<JobPosition>> getAll() {
        return new SuccessDataResult<>(this.jopPositionDao.findAll(),"Data Listelendi");
    }

    @Override
    public Result add(JobPosition jobPosition) {
        if (jopPositionDao.findAllByPosition(jobPosition.getPosition()).stream().count()!=0){
            return new ErrorResult("Aynı İsimde İş Pozisyonu Kullanılamaz");
        }else{
            jopPositionDao.save(jobPosition);
            return new SuccessResult(("Başarılı Bir Şekilde Sisteme Eklendi"));
        }


    }
}
