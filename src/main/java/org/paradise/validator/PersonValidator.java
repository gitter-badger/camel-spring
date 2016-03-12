package org.paradise.validator;

import org.paradise.domain.Person;
import org.paradise.monad.Failure;
import org.paradise.monad.Success;
import org.paradise.monad.Validation;

/**
 * Created by terrence on 12/03/2016.
 */
public class PersonValidator {

    public static Validation<String, Person> validateAge(Person p) {
        return (p.getAge() > 0 && p.getAge() < 130) ? new Success(p) : new Failure("Age must be between 0 and 130", p);
    }

    public static Validation<String, Person> validateName(Person p) {
        return Character.isUpperCase(p.getName().charAt(0)) ? new Success(p) : new Failure("Name must start with uppercase", p);
    }

}
