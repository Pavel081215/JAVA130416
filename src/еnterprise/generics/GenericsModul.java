package еnterprise.generics;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Pavel on 18.03.2016.
 */
public class GenericsModul {


    public interface Executor<T> {

        // Добавить таск на выполнение. Результат таска будет доступен через метод getValidResults().
        // Бросает Эксепшн если уже был вызван метод execute()
        void addTask(Task<? extends T> task) throws MethodHasBeenStartedException;

        // Добавить таск на выполнение и валидатор результата. Результат таска будет записан в ValidResults если validator.isValid вернет true для этого результата
        // Результат таска будет записан в InvalidResults если validator.isValid вернет false для этого результата
        // Бросает Эксепшн если уже был вызван метод execute()
        void addTask(Task<? extends T> task, Validator<? super T> validator) throws MethodHasBeenStartedException;

        // Выполнить все добавленые таски
        void execute();

        // Получить валидные результаты. Бросает Эксепшн если не был вызван метод execute()
        List getValidResults();

        // Получить невалидные результаты. Бросает Эксепшн если не был вызван метод execute()
        List getInvalidResults();

    }


    public class ExecutorImpl<T> implements Executor<T> {

        List<Task<? extends T>> taskExecutor = new ArrayList();
        List<? extends T> number = new ArrayList();
        boolean flag = false;

        @Override
        public void addTask(Task<? extends T> task) throws MethodHasBeenStartedException {

            if (flag != true) {
                taskExecutor.add(task);
            } else {
                throw new MethodHasBeenStartedException("Метод execute был запущен раньше ");
            }

        }

        @Override
        public void addTask(Task<? extends T> task, Validator<? super T> validator) throws MethodHasBeenStartedException {
            if (validator.isValid(task.getResult())) {
                taskExecutor.add(task);
            }

            if (flag != true) {
                taskExecutor.add(task);
            } else {
                throw new MethodHasBeenStartedException("Метод execute был запущен раньше ");
            }

        }

        @Override
        public void execute() {
            flag = true;

            for (int i = 0; i < taskExecutor.size(); i++) {

                taskExecutor.get(i).execute();
            }
        }

        @Override
        public List getValidResults() {

            for (int i = 0; i < taskExecutor.size(); i++) {

                if (Validator.isValid(taskExecutor.get(i).getResult())) {
                    number.add(taskExecutor.get(i).getResult());
                }
            }
            return number;
        }


        @Override
        public List getInvalidResults() {

            for (int i = 0; i < taskExecutor.size(); i++) {

                if (Validator.isValid(taskExecutor.get(i).getResult())) {
                    number.add(taskExecutor.get(i).getResult());
                }
            }
            return number;
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
        public boolean isValid(Number n) {
            return n.doubleValue() > 0;
        }
    }

    public class IntegerValidator implements Validator<Integer> {
        @Override
        public boolean isValid(Integer s) {
            return s.doubleValue() > 0;
        }
    }


    // пример испотльзования

    public void test(List<Task<Integer>> intTasks) throws MethodHasBeenStartedException {
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


