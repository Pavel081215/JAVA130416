package еnterprise.generics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import еnterprise.generics.TaskGenerics.Task;
import еnterprise.generics.ValidatorGenerics.Validator;
import еnterprise.generics.TaskGenerics.LongTask;
import еnterprise.generics.ExecutorGenerics.ExecutorImpl;
import еnterprise.generics.ExecutorGenerics.Executor;
import еnterprise.generics.TaskGenerics.Task;
import еnterprise.generics.ValidatorGenerics.NumberValidator;


import еnterprise.generics.TaskGenerics;

/**
 * Created by Pavel on 20.03.2016.
 */
public  class ExecutorGenerics {

    public static interface Executor<T> {

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

    public static class ExecutorImpl<T> implements Executor<T> {

        List<Task<? extends T>> taskExecutor = new ArrayList();

        List<? super T> number = new ArrayList();

        Map<Task<? extends T>, Validator<? super T>> selectionNumberValidator = new HashMap<>();

        boolean flag = false;

        @Override
        public void addTask(Task<? extends T> task) throws MethodHasBeenStartedException {

            if (flag != true) {
                taskExecutor.add(task);
                selectionNumberValidator.put(task, null);

            } else {
                throw new MethodHasBeenStartedException("Метод execute был запущен раньше ");
            }
        }

        @Override
        public void addTask(Task<? extends T> task, Validator<? super T> validator) throws MethodHasBeenStartedException {

            if (flag != true) {
                selectionNumberValidator.put(task, validator);
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

                if (taskExecutor.get(i) != null) {
                    if (selectionNumberValidator.get(taskExecutor.get(i)).isValid(taskExecutor.get(i).getResult())) {
                        number.add(taskExecutor.get(i).getResult());
                    }
                } else {
                    number.add(taskExecutor.get(i).getResult());
                }
            }
            return number;
        }

        @Override
        public List getInvalidResults() {

            for (int i = 0; i < taskExecutor.size(); i++) {

                if (!selectionNumberValidator.get(taskExecutor.get(i)).isValid(taskExecutor.get(i).getResult())) {
                    number.add(taskExecutor.get(i).getResult());
                }
            }
            return number;
        }
    }


}
