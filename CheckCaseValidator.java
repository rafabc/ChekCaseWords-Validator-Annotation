package com.mvc.validators;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CheckCaseValidator implements ConstraintValidator<CheckCaseWords, String> {

	private CaseMode caseMode;

	@Override
	public void initialize(CheckCaseWords constraintAnnotation) {
		this.caseMode = constraintAnnotation.value();
	}

	@Override
	public boolean isValid(String object, ConstraintValidatorContext constraintContext) {

		if (object == null) {
			return true;
		}

		boolean isValid;
		if (caseMode == CaseMode.UPPER) {
			isValid = object.equals(object.toUpperCase());
		} else {
			isValid = object.equals(object.toLowerCase());
		}

		if (!isValid) {
			constraintContext.disableDefaultConstraintViolation();
			constraintContext.buildConstraintViolationWithTemplate(caseMode.getMsg()).addConstraintViolation();
		}

		return isValid;
	}

}

