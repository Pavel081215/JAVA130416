package generics;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Pavel on 17.03.2016.
 */
public class GenericsModul {

    public interface Executor<Task> {

        // Добавить таск на выполнение. Результат таска будет доступен через метод getValidResults().
        // Бросает Эксепшн если уже был вызван метод execute()
        void addTask(Task task);

        // Добавить таск на выполнение и валидатор результата. Результат таска будет записан в ValidResults если validator.isValid вернет true для этого результата
        // Результат таска будет записан в InvalidResults если validator.isValid вернет false для этого результата
        // Бросает Эксепшн если уже был вызван метод execute()
        void addTask(Task task, Validator validator);

        // Выполнить все добавленые таски
        void execute();

        // Получить валидные результаты. Бросает Эксепшн если не был вызван метод execute()
        List getValidResults();

        // Получить невалидные результаты. Бросает Эксепшн если не был вызван метод execute()
        List getInvalidResults();

    }


    public class ExecutorImpl implements Executor<Task> {

        List taskExecutor = new ArrayList();
        Task<LongTask> longTask;

        public ExecutorImpl(List taskExecutor, Task<LongTask> longTask) {
            this.taskExecutor = taskExecutor;
            this.longTask = longTask;
        }

        @Override
        public void addTask(Task task) {
            taskExecutor.add(longTask);

        }

        @Override
        public void addTask(Task task, Validator validator) {



        }

        @Override
        public void execute() {

        }

        @Override
        public List getValidResults() {
            return null;
        }

        @Override
        public List getInvalidResults() {
            return null;
        }
    }


    //
    public interface Task<T> {

        // Метода запускает таск на выполнение
        void execute();

        // Возвращает результат выполнения
        T getResult();


    }

    public class LongTask implements Task<Long> {
        long result;

        public LongTask(long result) {
            this.result = result;
        }

        @Override
        public void execute() {
            result = result + 1100L;

        }

        @Override
        public Long getResult() {
            if (result < 1111L) {
                return 0L;
            }
            return result;
        }
    }


    //
    public interface Validator<T> {

        // Валидирует переданое значение
        boolean isValid(T result);

    }


    public class NumberValidator implements Validator<Number> {


        @Override
        public boolean isValid(Number result) {

            return false;
        }
    }


    // пример испотльзования

    public void test(List<Task<Integer>> intTasks) {
        Executor<Number> numberExecutor = new ExecutorImpl<>();

        for (Task<Integer> intTask : intTasks) {
            numberExecutor.addTask(intTask);
        }
        numberExecutor.addTask(new LongTask(10L), new NumberValidator());

        numberExecutor.execute();

        System.out.println("Valid results:");
        for (Number number : numberExecutor.getValidResults()) {
            System.out.println(number);
        }
        System.out.println("Invalid results:");
        for (Number number : numberExecutor.getInvalidResults()) {
            System.out.println(number);
        }
    }

}
