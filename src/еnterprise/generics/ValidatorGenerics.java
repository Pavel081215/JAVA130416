package еnterprise.generics;

/**
 * Created by Pavel on 20.03.2016.
 */
public  class ValidatorGenerics {

    public interface Validator<T> {
        // Валидирует переданое значение
        boolean isValid(T result);
    }


    public static  class NumberValidator implements Validator<Number> {
        @Override
        public boolean isValid(Number n) {
            return n.doubleValue() > 0;
        }
    }

    public static class IntegerValidator implements Validator<Integer> {
        @Override
        public boolean isValid(Integer s) {
            return s.doubleValue() > 0;
        }
    }

}
