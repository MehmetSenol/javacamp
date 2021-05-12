package kodlamaio.hrms.api.controllers;

import kodlamaio.hrms.business.abstracts.JopPositionService;
import kodlamaio.hrms.entities.concretes.JobPosition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



import java.util.List;

@RestController
@RequestMapping("api/jobpositions")
public class JopPositionsController {
    private JopPositionService jopPositionService;

    @Autowired
    public JopPositionsController(JopPositionService jopPositionService) {
        this.jopPositionService = jopPositionService;
    }


    @GetMapping("/getall")
    public List<JobPosition> getall(){
        return this.jopPositionService.getAll();
    }

}
