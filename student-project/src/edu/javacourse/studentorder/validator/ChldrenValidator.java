package edu.javacourse.studentorder.validator;

import edu.javacourse.studentorder.domain.AnswerChildren;
import edu.javacourse.studentorder.domain.StudentOrder;

public class ChldrenValidator
{
    public AnswerChildren checkChildren(StudentOrder so) {
        System.out.println("Children Check is running");
        return new AnswerChildren();
    }
}
