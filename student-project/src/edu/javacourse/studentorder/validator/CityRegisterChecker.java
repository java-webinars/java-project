package edu.javacourse.studentorder.validator;

import edu.javacourse.studentorder.domain.CityRegisterCheckerResponse;
import edu.javacourse.studentorder.domain.Person;

public interface CityRegisterChecker
{
    CityRegisterCheckerResponse checkPerson(Person person);
}
