package еnterprise.generics;

import junit.framework.TestCase;
import org.junit.*;
import еnterprise.generics.ExecutorGenerics.Executor;
import еnterprise.generics.TaskGenerics.Task;
import еnterprise.generics.ValidatorGenerics.Validator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * Created by Pavel on 20.03.2016.
 */
public class ExecutorImplTest extends TestCase {


    @Ignore
    @Test
    public void testAddTask() throws Exception {

    }
    @Ignore
    @Test
    public void testAddTask1() throws Exception {

    }

    @Test
    public void testExecute() throws Exception {

    }

    @Test
    public void testGetValidResults() throws Exception {

        List<Number> number1 = new ArrayList();


        List<Task<Long>> taskExecutor = new ArrayList();
        List<Number> number = new ArrayList();
        Map<Task<Long>, Validator<Number>> selectionNumberValidator = new HashMap<>();
        Task<Long> task1 = new LongTask(1l);
        Task<Long> task2 = new LongTask(30l);
        Task<Long> task3 = new LongTask(2l);
        Task<Long> task4 = new LongTask(4l);
        selectionNumberValidator.put(task1, new NumberValidator());
        selectionNumberValidator.put(task2, new NumberValidator());
        selectionNumberValidator.put(task3, new NumberValidator());
        selectionNumberValidator.put(task4, new NumberValidator());
        taskExecutor.add(task1);
        taskExecutor.add(task2);
        taskExecutor.add(task3);
        taskExecutor.add(task4);

    }

    @Ignore
    @Test
    public void testGetInvalidResults() throws Exception {

    }
}