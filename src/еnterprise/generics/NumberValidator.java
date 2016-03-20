package ånterprise.generics;

/**
 * Created by Pavel on 20.03.2016.
 */
public  class NumberValidator implements ValidatorGenerics.Validator<Number> {

        @Override
        public boolean isValid(Number n) {
            return n.doubleValue() > 0;
        }
    }

