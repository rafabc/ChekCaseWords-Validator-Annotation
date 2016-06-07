package com.mvc.validators;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;
import javax.validation.constraints.Pattern;



@Pattern(regexp = "^[a-zA-Z_áéíóúñÁÉÍÓÚ\\s]*$", message="El campo solo admite letras")
@Target({ ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.ANNOTATION_TYPE })
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = CheckCaseValidator.class)
@Documented
public @interface CheckCaseWords {
	
    Class<?>[] groups() default { };

    Class<? extends Payload>[] payload() default { };

    CaseMode value();
    
    
    String message() default "Revisar el campo, no cumple las condiciones de validación";

    @Target({ ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.ANNOTATION_TYPE })
    @Retention(RetentionPolicy.RUNTIME)
    @Documented
    @interface List {
        CheckCaseWords[] value();
    }
    

}
