package kodlamaio.hrms.business.concretes;

import kodlamaio.hrms.business.abstracts.JopPositionService;
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
    public List<JobPosition> getAll() {
        return this.jopPositionDao.findAll();
    }
}
