package edu.javacourse.studentorder.dao;

import edu.javacourse.studentorder.domain.Street;
import edu.javacourse.studentorder.exception.DaoException;

import java.util.List;

public interface DictionaryDao
{
    List<Street> findStreets(String pattern) throws DaoException;
}
