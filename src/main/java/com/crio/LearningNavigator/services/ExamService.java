package com.crio.LearningNavigator.services;

import java.util.List;

import com.crio.LearningNavigator.dto.Exam;
import com.crio.LearningNavigator.exceptions.ExamNotFoundException;
import com.crio.LearningNavigator.exceptions.SubjectNotFoundException;
import com.crio.LearningNavigator.exchanges.CreateExamRequest;

public interface ExamService {
    
    Exam createExam(CreateExamRequest createExamRequest) throws SubjectNotFoundException;

    Exam findExamById(long examId) throws ExamNotFoundException;

    List<Exam> findAllExams();

    void deleteExam(long examId) throws ExamNotFoundException;
    
}
