package com.sportathon.performance.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.sportathon.performance.entity.Performance;
import com.sportathon.performance.service.PerformanceService;
import org.springframework.web.bind.annotation.CrossOrigin;


@RestController
//@Controller
@RequestMapping("/performance")
@CrossOrigin(origins = "*")
public class SportController {
 
	@Autowired
    private PerformanceService performanceService;

   
 
    @GetMapping("/getPer")
    public List<Performance> getAllPerformance() {
        return performanceService.findAll();
    }
 

 
    @PostMapping("/addPer")
    public Performance addPerformance(@RequestBody Performance performance) {
        return performanceService.addPerformance(performance);
    }
 
    @PutMapping("/updPer")
    public Performance updatePerformance(@RequestBody Performance teamDetails) {

        return performanceService.updatePerformance(teamDetails);
    }
 
}