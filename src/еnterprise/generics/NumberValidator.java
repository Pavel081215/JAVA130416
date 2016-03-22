package еnterprise.generics;

import еnterprise.generics.ValidatorGenerics.Validator;
/**
 * Created by Pavel on 20.03.2016.
 */
public  class NumberValidator implements Validator<Number> {

        @Override
        public boolean isValid(Number n) {
            return n.doubleValue() > 4;
        }
    }

