package com.sportathon.performance.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sportathon.performance.entity.Performance;
import com.sportathon.performance.repository.SportRepository;

@Service
public class PerformanceServiceImpl implements PerformanceService {
	@Autowired
	private SportRepository sportRepo;
	@Override
	public Performance addPerformance(Performance addPer){
		return sportRepo.save(addPer);
		
	}
	@Override
	public Performance updatePerformance(Performance teamDetails ) {
		Performance performance = sportRepo.findById(teamDetails.getTeamId())
                .orElseThrow(() -> new RuntimeException("User not found with teamName: "));
       performance.setSportRank(teamDetails.getSportRank());
//	   teamDetails.setSportRank(teamDetails.getSportRank());
	   return sportRepo.save(performance);
	}
	@Override
	public List<Performance> findAll() {
		return sportRepo.findAll();
	}



	

	

	


}
