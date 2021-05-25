package kodlamaio.hrms.api.controllers;

import kodlamaio.hrms.business.abstracts.JopPositionService;
import kodlamaio.hrms.core.DataResult;
import kodlamaio.hrms.core.Result;
import kodlamaio.hrms.entities.concretes.JobPosition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


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
    public DataResult<List<JobPosition>> getAll(){
        return this.jopPositionService.getAll();
    }

    @PostMapping("/add")
    public Result add(@RequestBody JobPosition jobPosition){
        return this.jopPositionService.add(jobPosition);
    }

}
