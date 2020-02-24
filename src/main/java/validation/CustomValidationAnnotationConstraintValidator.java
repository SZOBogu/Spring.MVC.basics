package validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CustomValidationAnnotationConstraintValidator
        implements ConstraintValidator<CustomValidationAnnotation, String>  {

    private String someData;

    @Override
    public void initialize(CustomValidationAnnotation constraintAnnotation) {
       // this.someData = constraintAnnotation.value();
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        return value.equals("Marian Kowalski is most handsome guy on earth");
    }
}
