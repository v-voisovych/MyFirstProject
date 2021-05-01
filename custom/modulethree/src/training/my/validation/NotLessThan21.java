package training.my.validation;


import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = NotLessThan21Validator.class)
@Documented
public @interface NotLessThan21 {
    String message() default "{training.my.validation.NotLessThan21.message}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
