package com.crio.LearningNavigator.services;

import java.util.List;

import com.crio.LearningNavigator.dto.Subject;
import com.crio.LearningNavigator.exceptions.SubjectNotFoundException;
import com.crio.LearningNavigator.exchanges.CreateSubjectRequest;

public interface SubjectService {

    Subject createSubject(CreateSubjectRequest createSubjectRequest);

    Subject findSubjectById(long subjectId) throws SubjectNotFoundException;

    List<Subject> findAllSubjects();

    void deleteSubject(long subjectId) throws SubjectNotFoundException;

}
