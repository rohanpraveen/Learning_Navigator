package com.crio.LearningNavigator.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crio.LearningNavigator.models.SubjectEntity;

public interface SubjectRepository extends JpaRepository<SubjectEntity, Long> {
    
}
