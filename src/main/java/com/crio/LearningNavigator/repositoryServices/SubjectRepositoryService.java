package com.crio.LearningNavigator.repositoryServices;

import java.util.List;

import com.crio.LearningNavigator.dto.Subject;
import com.crio.LearningNavigator.exceptions.SubjectNotFoundException;

public interface SubjectRepositoryService {

    Subject createSubject(String subjectName);

    Subject findSubjectById(long subjectId) throws SubjectNotFoundException;

    List<Subject> findAllSubjects();

    void deleteSubject(long subjectId) throws SubjectNotFoundException;
}
