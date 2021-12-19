package com.girish.springmvcdemo.validator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = CourseCodeConstraintValidator.class)
@Target({ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface CourseCode {
    // define and setup default value for parameter of the annotation
    public String value() default "sub";

    public String message() default "must start with sub";

    public Class<? extends Payload>[] payload() default {};

    public Class<?>[] groups() default {};
}
