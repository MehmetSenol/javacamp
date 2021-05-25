package kodlamaio.hrms.business.concretes;

import kodlamaio.hrms.business.abstracts.CandidateService;
import kodlamaio.hrms.core.adapters.UserCheckService;
import kodlamaio.hrms.core.utilities.*;
import kodlamaio.hrms.dataAccess.abstracts.CandidateDao;
import kodlamaio.hrms.entities.concretes.Candidate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CandidateManager implements CandidateService {
    private CandidateDao candidateDao;
    private UserCheckService userCheckService;



    @Autowired
    public CandidateManager(CandidateDao candidateDao, UserCheckService userCheckService) {
        this.candidateDao = candidateDao;
        this.userCheckService = userCheckService;

    }

    @Override
    public DataResult<List<Candidate>> getAll() {
        return new SuccessDataResult<>(this.candidateDao.findAll(),"Data Listelendi");
    }



    @Override
    public Result add(Candidate candidate) {
        if (candidate.getFirstName()==null || candidate.getLastName()==null || candidate.getNationalIdentity()==null ||
                candidate.getBirthDate()==null || candidate.getEmail()==null || candidate.getPassword()==null){
            return new ErrorResult("Alanlar Boş Geçilemez");
        }else if(userCheckService.checkIfRealPerson(candidate.getNationalIdentity(),candidate.getFirstName(),candidate.getLastName(),candidate.getBirthDate())==false){
            return new ErrorResult("Mernis Doğrulaması Gerçekleşmedi");
        }else if(candidateDao.findAllByEmail(candidate.getEmail()).stream().count()!=0){
            return new ErrorResult("Aynı Email Kullanılmakta");
        }else if(candidateDao.findAllByNationalIdentity(candidate.getNationalIdentity()).stream().count()!=0){
            return new ErrorResult("Aynı T.C. kimlik numarası kullanılamaz");
        }else if(!this.userCheckService.checkMailActivation()){
            return new ErrorResult("Lütfen Emailinizi Onaylayınız");
        }
        else{
            candidateDao.save(candidate);
            return new SuccessResult("Başarılı Bir Şekilde Sisteme Eklenmiştir...");
        }




    }
}
