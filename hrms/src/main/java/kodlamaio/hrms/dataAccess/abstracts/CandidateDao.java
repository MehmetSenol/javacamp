package kodlamaio.hrms.dataAccess.abstracts;

import kodlamaio.hrms.entities.concretes.Candidate;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CandidateDao extends JpaRepository<Candidate,Integer> {
    List<Candidate> findAllByEmail(String email);
    List<Candidate> findAllByNationalIdentity(String nationalIdentity);
}
