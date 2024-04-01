package com.sportathon.performance.service;


import java.util.List;

import com.sportathon.performance.entity.Performance;

public interface PerformanceService {
Performance addPerformance(Performance addPer);
Performance updatePerformance(Performance upPer) ;
List<Performance> findAll();
}
