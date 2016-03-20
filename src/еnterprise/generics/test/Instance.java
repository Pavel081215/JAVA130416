package ånterprise.generics.test;

import javafx.concurrent.Task;

import java.util.List;

/**
 * Created by Pavel on 20.03.2016.
 */
public class Instance {




    public void test(List<Task<Integer>> intTasks) {

      /* Executor<Number> numberExecutor = new ExecutorImpl<>();


        for (Task<Integer> intTask : intTasks) {
            numberExecutor.addTask(intTask);
        }



        numberExecutor.addTask(new GenericsModul2.LongTask(10L), new GenericsModul2.NumberValidator());



        numberExecutor.execute();



        System.out.println("Valid results:");

        for (Number number : numberExecutor.getValidResults()) {
            System.out.println(number);
        }

        System.out.println("Invalid results:");

        for (Number number : numberExecutor.getInvalidResults()) {
            System.out.println(number);
        }
*/
    }

}
