package еnterprise.generics_2;

import junit.framework.TestCase;
import еnterprise.generics_2.ValidatorGenerics.Validator;
import org.junit.*;

import java.util.*;
import java.util.ArrayList;


public class ExecutorImplTest   {
   private Validator<Number> validator;
    private TaskGenerics.Task<Long> task1;
    private TaskGenerics.Task<Long> task10;
    private ExecutorImpl<Number> executorImpl = new ExecutorImpl();
    private  List<Long> expected = new ArrayList<>();

    @Before
    public void setUp() throws Exception {
        task1 = new LongTask(-200);
        task10 = new LongTask(10L);
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
        expected.add(13L);
       // expected.add(-197L);

        actuals.addAll(executorImpl.getValidResults());

       // Assert.assertArrayEquals(expected, actuals);
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
        expected.add(-7L);
        //expected.add(3);
        actuals.addAll(executorImpl.getInvalidResults());
        Assert.assertEquals(expected, actuals);

    }



}