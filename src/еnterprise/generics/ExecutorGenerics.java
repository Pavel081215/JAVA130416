package еnterprise.generics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import еnterprise.generics.TaskGenerics.Task;
import еnterprise.generics.ValidatorGenerics.Validator;


/**
 * Created by Pavel on 20.03.2016.
 */
public class ExecutorGenerics {

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
        List<T> getValidResults();

        // Получить невалидные результаты. Бросает Эксепшн если не был вызван метод execute()
        List<T> getInvalidResults();
    }


}
