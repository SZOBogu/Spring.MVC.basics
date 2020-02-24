package validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = CustomValidationAnnotationConstraintValidator.class)
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface CustomValidationAnnotation  {
  //  String value() default "???";
    String message() default "to be thought of";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};

//    @Target({ ElementType.TYPE })
//    @Retention(RetentionPolicy.RUNTIME)
//    @interface List {
//        FieldsValueMatch[] value();
//    }
}
