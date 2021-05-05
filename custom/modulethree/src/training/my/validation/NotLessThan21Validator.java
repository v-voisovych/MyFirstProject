package training.my.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class NotLessThan21Validator implements ConstraintValidator<NotLessThan21, Integer> {
    @Override
    public void initialize(NotLessThan21 constraintAnnotation) {

    }

    @Override
    public boolean isValid(Integer integer, ConstraintValidatorContext constraintValidatorContext) {
        return !(integer <= 21);
    }
}
