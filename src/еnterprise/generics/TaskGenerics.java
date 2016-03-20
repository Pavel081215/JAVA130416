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



}
