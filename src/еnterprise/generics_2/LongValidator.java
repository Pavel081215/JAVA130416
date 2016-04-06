package еnterprise.generics_2;

import еnterprise.generics_2.ValidatorGenerics.Validator;

/**
 * Created by Pavel on 22.03.2016.
 */
    public class LongValidator implements Validator<Long> {

    @Override
    public boolean isValid(Long s) {
        if (s > 0) {
            return false;
        } else {
            return true;
        }
    }
}
