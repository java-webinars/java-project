package edu.javacourse.studentorder.dao;

import edu.javacourse.studentorder.domain.StudentOrder;
import edu.javacourse.studentorder.exception.DaoException;

public interface StudentOrderDao
{
    Long saveStudentOrder(StudentOrder so) throws DaoException;
}
