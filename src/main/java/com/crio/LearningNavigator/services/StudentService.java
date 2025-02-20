package com.crio.LearningNavigator.services;

import java.util.List;

import com.crio.LearningNavigator.dto.Student;
import com.crio.LearningNavigator.exceptions.ExamNotFoundException;
import com.crio.LearningNavigator.exceptions.StudentNotFoundException;
import com.crio.LearningNavigator.exceptions.SubjectNotEnrolledException;
import com.crio.LearningNavigator.exceptions.SubjectNotFoundException;
import com.crio.LearningNavigator.exchanges.RegisterStudentRequest;

public interface StudentService {

    Student registerStudent(RegisterStudentRequest registerStudentRequest);

    Student findStudentById(long studentId) throws StudentNotFoundException;

    Student enrollStudentInSubject(long studentId, long subjectId) throws StudentNotFoundException, SubjectNotFoundException;

    Student registerStudentForExam(long studentId, long examId) throws StudentNotFoundException, ExamNotFoundException, SubjectNotEnrolledException;

    List<Student> findAllStudents();

    void deregisterStudent(long studentId) throws StudentNotFoundException;
    
}
