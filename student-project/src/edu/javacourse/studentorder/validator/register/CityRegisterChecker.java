package edu.javacourse.studentorder.validator.register;

import edu.javacourse.studentorder.domain.register.CityRegisterResponse;
import edu.javacourse.studentorder.domain.Person;
import edu.javacourse.studentorder.exception.CityRegisterException;

public interface CityRegisterChecker
{
    CityRegisterResponse checkPerson(Person person) throws CityRegisterException;
}
