package еnterprise.generics;

/**
 * Created by Pavel on 20.03.2016.
 */
public class TaskGenerics {

    public interface Task<T> {
        // Метода запускает таск на выполнение
        void execute();

        // Возвращает результат выполнения
        T getResult();

    }

    public static class LongTask implements Task<Long> {
        Long result;

        public LongTask(long result) {

            this.result = result;
        }


        @Override
        public void execute() {
            result = result + 1L;

        }

        @Override
        public Long getResult() {
            if (result < 1L) {
                return 0L;
            }
            return result;
        }
    }

}
