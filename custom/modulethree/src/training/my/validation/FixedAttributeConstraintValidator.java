package training.my.validation;

import de.hybris.platform.validation.interceptors.AttributeConstraintValidator;
import de.hybris.platform.validation.model.constraints.AttributeConstraintModel;


public class FixedAttributeConstraintValidator extends AttributeConstraintValidator
{
    @Override
    protected boolean isConstraintValidForAccessor(final AttributeConstraintModel constraint)
    {
        final Class constraintAnnotation = constraint.getAnnotation();
        final String annotationClass = constraintAnnotation.getName();

        if (annotationClass.equals("training.my.validation.NotLessThan21"))
        {
            return true;
        }
        else
        {
            return super.isConstraintValidForAccessor(constraint);
        }
    }
}