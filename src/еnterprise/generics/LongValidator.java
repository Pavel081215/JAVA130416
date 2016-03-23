package еnterprise.generics;

import еnterprise.generics.ValidatorGenerics.Validator;

/**
 * Created by Pavel on 22.03.2016.
 */
public class LongValidator implements Validator<Long> {

    @Override
    public boolean isValid(Long s) {
        return s > 3;
    }
}
