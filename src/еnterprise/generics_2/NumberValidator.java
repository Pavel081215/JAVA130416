package еnterprise.generics_2;

import еnterprise.generics_2.ValidatorGenerics.Validator;

/**
 * Created by Pavel on 20.03.2016.
 */
public class NumberValidator implements Validator<Number> {

    @Override
    public boolean isValid(Number n) {
        if (n.intValue() > 0) {
            return true;
        } else {
            return false;
        }


    }
}

