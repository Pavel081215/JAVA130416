package еnterprise.generics_2;

import еnterprise.generics_2.ValidatorGenerics.Validator;


public class IntegerValidator implements Validator<Integer> {
    public boolean isValid(Integer s) {
        return s.doubleValue() > 0;
    }
}

