package �nterprise.generics.test;

import �nterprise.generics.MethodHasBeenStartedException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Pavel on 20.03.2016.
 */
public class GenericsModulTest {
    /*
    public interface Executor<T> {

        // �������� ���� �� ����������. ��������� ����� ����� �������� ����� ����� getValidResults().
        // ������� ������� ���� ��� ��� ������ ����� execute()
        void addTask(Task<? extends T> task) throws MethodHasBeenStartedException;

        // �������� ���� �� ���������� � ��������� ����������. ��������� ����� ����� ������� � ValidResults ���� validator.isValid ������ true ��� ����� ����������
        // ��������� ����� ����� ������� � InvalidResults ���� validator.isValid ������ false ��� ����� ����������
        // ������� ������� ���� ��� ��� ������ ����� execute()
        void addTask(Task<? extends T> task, Validator<? super T> validator) throws MethodHasBeenStartedException;

        // ��������� ��� ���������� �����
        void execute();

        // �������� �������� ����������. ������� ������� ���� �� ��� ������ ����� execute()
        List getValidResults();

        // �������� ���������� ����������. ������� ������� ���� �� ��� ������ ����� execute()
        List getInvalidResults();
    }

    public class ExecutorImpl<T> implements Executor<T> {

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
                throw new MethodHasBeenStartedException("����� execute ��� ������� ������ ");
            }
        }

        @Override
        public void addTask(Task<? extends T> task, Validator<? super T> validator) throws MethodHasBeenStartedException {

            if (flag != true) {
                selectionNumberValidator.put(task, validator);
            } else {
                throw new MethodHasBeenStartedException("����� execute ��� ������� ������ ");
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

    //
    public interface Task<T> {
        // ������ ��������� ���� �� ����������
        void execute();

        // ���������� ��������� ����������
        T getResult();

    }

    public class LongTask implements Task<Long> {
        Long result;

        public LongTask(long result) {

            this.result = result;
        }


        @Override
        public void execute() {
            result = result + 1L;

        }

        @Override
        public Long getResult() {
            if (result < 1L) {
                return 0L;
            }
            return result;
        }
    }

    //
    public interface Validator<T> {
        // ���������� ��������� ��������
        boolean isValid(T result);
    }


    public class NumberValidator implements Validator<Number> {
        @Override
        public boolean isValid(Number n) {
            return n.doubleValue() > 0;
        }
    }

    public class IntegerValidator implements Validator<Integer> {
        @Override
        public boolean isValid(Integer s) {
            return s.doubleValue() > 0;
        }
    }


    // ������ ��������������

    public void test(List<Task<Integer>> intTasks) throws MethodHasBeenStartedException {
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
    }*/
}
