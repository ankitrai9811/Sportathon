package com.sportathon.performance.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.sportathon.performance.entity.Performance;
@Repository
public interface SportRepository extends JpaRepository<Performance,Long> {
    }
