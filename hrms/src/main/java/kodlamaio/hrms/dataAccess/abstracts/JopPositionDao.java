package kodlamaio.hrms.dataAccess.abstracts;

import kodlamaio.hrms.entities.concretes.JobPosition;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface JopPositionDao extends JpaRepository<JobPosition,Integer> {
    List<JobPosition> findAllByPosition(String position);
}
