package еnterprise.generics;

/**
 * Created by Pavel on 20.03.2016.
 */
public  class ValidatorGenerics {

    public interface Validator<T> {
        // Валидирует переданое значение
        boolean isValid(T result);
    }




}
