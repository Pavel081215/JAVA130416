package еnterprise.generics;

import еnterprise.generics.ValidatorGenerics.Validator;


public class IntegerValidator implements Validator<Integer> {
    public boolean isValid(Integer s) {
        return s.doubleValue() > 0;
    }
}

