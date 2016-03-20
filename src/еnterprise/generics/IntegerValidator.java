package ånterprise.generics;

import ånterprise.generics.ValidatorGenerics.Validator;


public class IntegerValidator implements Validator<Integer> {
    public boolean isValid(Integer s) {
        return s.doubleValue() > 0;
    }
}

