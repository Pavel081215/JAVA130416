package еnterprise.generics;

import org.junit.Test;

import java.util.List;


import еnterprise.generics.ExecutorGenerics.Executor;
import еnterprise.generics.TaskGenerics.Task;


public class Cheks {

    public void test(List<Task<Integer>> intTasks) throws Exception {
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
