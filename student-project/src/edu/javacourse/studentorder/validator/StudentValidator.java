package edu.javacourse.studentorder.validator;

import edu.javacourse.studentorder.domain.student.AnswerStudent;
import edu.javacourse.studentorder.domain.StudentOrder;

public class StudentValidator
{
    public AnswerStudent checkStudent(StudentOrder so) {
        System.out.println("Студенты проверяются");
        return new AnswerStudent();
    }
}
