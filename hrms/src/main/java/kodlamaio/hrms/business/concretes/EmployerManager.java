package kodlamaio.hrms.business.concretes;

import kodlamaio.hrms.business.abstracts.EmployerService;
import kodlamaio.hrms.core.*;
import kodlamaio.hrms.dataAccess.abstracts.EmployerDao;
import kodlamaio.hrms.entities.concretes.Employer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployerManager implements EmployerService {
    private EmployerDao employerDao;

    @Autowired
    public EmployerManager(EmployerDao employerDao) {
        this.employerDao = employerDao;
    }


    @Override
    public DataResult<List<Employer>> getAll() {
        return new SuccessDataResult<>(this.employerDao.findAll(),"Data Listelendi");
    }

    @Override
    public boolean checkMailActivation() {
        return true;
    }

    @Override
    public boolean checkUserActivationEmployee() {
        return true;
    }

    @Override
    public Result add(Employer employer) {
        if (employer.getCompanyName()==null || employer.getPhoneNumber()==null || employer.getWebAddress()==null || employer.getPassword()==null){
            return new ErrorResult("Alanlar Boş Bırakılamaz");
        }else if(employer.getPassword().length()<6){
            return new ErrorResult("Şifre 6 Karakterden Az Olamaz");
        }else if(employer.getWebAddress().contains(employer.getEmail())==false){
            return new ErrorResult(("Aynı Domaine Sahip Mail Adresi Kullanılmalıdır"));
        }else if(employerDao.findAllByEmail(employer.getEmail()).stream().count()!=0){
            return new ErrorResult("Aynı E posta Kullanılmaktadır");
        }else if(!this.checkMailActivation()){
            return new ErrorResult("Lütfen Emailinizi Onaylayınız");
        }else if(!this.checkUserActivationEmployee()){
            return new ErrorResult("Çalışanımız Tarafından Daha Onaylanmadınız");
        }else{
            employerDao.save(employer);
            return new SuccessResult("Sisteme Başarılı Bir Şekilde Kaydınız Gerçekleşmiştir");
        }


    }
}
