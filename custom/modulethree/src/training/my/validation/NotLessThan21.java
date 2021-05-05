package training.my.validation;


import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.ElementType.TYPE_USE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target({METHOD, FIELD, ANNOTATION_TYPE, CONSTRUCTOR, PARAMETER, TYPE_USE})
@Retention(RUNTIME)
@Documented
@Constraint(validatedBy = {NotLessThan21Validator.class})
public @interface NotLessThan21 {
    String message() default "{training.my.validation.NotLessThan21.message}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}
