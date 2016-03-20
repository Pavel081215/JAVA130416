package еnterprise.generics;

import еnterprise.generics.ExecutorGenerics.Executor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Pavel on 20.03.2016.
 */
public class ExecutorImpl<T> implements Executor<T> {
    List<TaskGenerics.Task<? extends T>> taskExecutor = new ArrayList();

    List<T> number = new ArrayList();

    Map<TaskGenerics.Task<? extends T>, ValidatorGenerics.Validator<? super T>> selectionNumberValidator = new HashMap<>();

    boolean flag = false;

    @Override
    public void addTask(TaskGenerics.Task<? extends T> task) throws MethodHasBeenStartedException {

        if (flag != true) {
            taskExecutor.add(task);
            selectionNumberValidator.put(task, null);

        } else {
            throw new MethodHasBeenStartedException("Метод execute был запущен раньше ");
        }
    }

    @Override
    public void addTask(TaskGenerics.Task<? extends T> task, ValidatorGenerics.Validator<? super T> validator) throws MethodHasBeenStartedException {

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
    public List<T> getValidResults() {

        for (int i = 0; i < taskExecutor.size(); i++) {


            if (selectionNumberValidator.get(taskExecutor.get(i)) != null) {
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
    public List<T> getInvalidResults() {

        for (int i = 0; i < taskExecutor.size(); i++) {

            if (selectionNumberValidator.get(taskExecutor.get(i)) == null) {
                if (!selectionNumberValidator.get(taskExecutor.get(i)).isValid(taskExecutor.get(i).getResult())) {
                    number.add(taskExecutor.get(i).getResult());
                }
            }

        }
        return number;
    }
}