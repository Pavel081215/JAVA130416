package еnterprise.generics;

import junit.framework.TestCase;
import org.junit.runners.model.TestClass;
import еnterprise.generics.ValidatorGenerics.Validator;
import org.junit.*;

import java.util.*;
import java.util.ArrayList;


public class ExecutorImplTest extends TestCase{
    Validator<Number> validator;
    TaskGenerics.Task<Long> task1;
    TaskGenerics.Task<Long> task10;
    ExecutorImpl executorImpl = new ExecutorImpl();
    List expected = new ArrayList<>();

    @Before
    public void setUp() throws Exception {
        task1 = new LongTask(-200);
        task10 = new LongTask(10);
    }

    @Test
    public void testAddTaskOneOption() throws Exception {
        executorImpl.addTask(task10);
    }

    @Test
    public void testAddTaskTwoOption() throws Exception {
        validator = new NumberValidator();
        executorImpl.addTask(task1, validator);
    }

    @Test
    public void execute() {
        executorImpl.execute();
    }

    @Test
    public void testGetValidResults() throws Exception {
        expected.clear();
        validator = new NumberValidator();
        executorImpl.addTask(task10);
        executorImpl.addTask(task1, validator);
        executorImpl.execute();
        List actuals = new ArrayList();
        expected.add(13);
        expected.add(-197);

        actuals.addAll(executorImpl.getValidResults());

        //Assert.assertArrayEquals(expected, actuals);
        Assert.assertEquals(expected, actuals);
        // Assert.assertEquals(new HashSet(expected), new HashSet(actuals));
    }

    @Test
    public void testGetInvalidResults() throws Exception {
        expected.clear();
        validator = new NumberValidator();
        task1 = new LongTask(-10);
        executorImpl.addTask(task10);
        executorImpl.addTask(task1, validator);
        executorImpl.execute();
        List actuals = new ArrayList();
        expected.add(-7);
        //expected.add(3);
        actuals.addAll(executorImpl.getInvalidResults());
        Assert.assertEquals(expected, actuals);

    }



}