package kodlamaio.hrms.business.concretes;

import kodlamaio.hrms.business.abstracts.EmployerService;
import kodlamaio.hrms.core.adapters.UserCheckService;
import kodlamaio.hrms.core.utilities.*;
import kodlamaio.hrms.dataAccess.abstracts.EmployerDao;
import kodlamaio.hrms.entities.concretes.Employer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployerManager implements EmployerService {
    private EmployerDao employerDao;
    private UserCheckService userCheckService;

    @Autowired
    public EmployerManager(EmployerDao employerDao, UserCheckService userCheckService) {
        this.employerDao = employerDao;
        this.userCheckService = userCheckService;
    }


    @Override
    public DataResult<List<Employer>> getAll() {
        return new SuccessDataResult<>(this.employerDao.findAll(),"Data Listelendi");
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
        }else if(!this.userCheckService.checkMailActivation()){
            return new ErrorResult("Lütfen Emailinizi Onaylayınız");
        }else if(!this.userCheckService.checkUserActivationEmployee()){
            return new ErrorResult("Çalışanımız Tarafından Daha Onaylanmadınız");
        }else{
            employerDao.save(employer);
            return new SuccessResult("Sisteme Başarılı Bir Şekilde Kaydınız Gerçekleşmiştir");
        }


    }
}
