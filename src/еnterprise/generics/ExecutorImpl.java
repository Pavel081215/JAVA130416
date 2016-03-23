package еnterprise.generics;

import еnterprise.generics.ExecutorGenerics.Executor;
import еnterprise.generics.TaskGenerics.Task;
import еnterprise.generics.ValidatorGenerics.Validator;
import еnterprise.generics.LongValidator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Pavel on 20.03.2016.
 */
public class ExecutorImpl<T> implements Executor<T> {
    List<Task<? extends T>> taskExecutor = new ArrayList();

    List<T> number = new ArrayList();

    Map<Task<? extends T>, Validator<? super T>> selectionNumberValidator = new HashMap<>();

    boolean flag = false;

    @Override
    public void addTask(Task<? extends T> task) throws MethodHasBeenStartedException {
        addTask(task, null);
    }

    @Override
    public void addTask(Task<? extends T> task, Validator<? super T> validator) throws MethodHasBeenStartedException {

        if (flag != true) {
            taskExecutor.add(task);
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
        number.clear();

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
        number.clear();
        for (int i = 0; i < taskExecutor.size(); i++) {

            if (selectionNumberValidator.get(taskExecutor.get(i)) != null) {
                if (!selectionNumberValidator.get(taskExecutor.get(i)).isValid(taskExecutor.get(i).getResult())) {
                    number.add(taskExecutor.get(i).getResult());
                }
            }

        }
        return number;
    }
}