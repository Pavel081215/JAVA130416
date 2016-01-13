package zagrebelnyy.fifth;

/**
 * Created by P.Zagrebelniy on 23.12.2015.
 */
public class Cheks {
    public static void main(String[] args) {
        int[] training = {-1222, 3333533, 3, 4, 655555555, 7, -8888, 5, 2, 22, 44, 999999999};

        int[] first = training;
        int[] second = training;
        int[] firth = training;
        int[] firth2 = training;
        int[] firth3 = training;


        System.out.println(" По умолчанию   ");
        for (int j = 0; j < first.length; j++) {
            System.out.print("    ");
            System.out.print(first[j]);
        }
        System.out.println("");

        SortInserts.insertionSort2(training, 1, 5);
        System.out.println("Вставка с пересенными  до -5   ");
        for (int j = 0; j < second.length; j++) {
            System.out.print("    ");
            System.out.print(second[j]);
        }
        System.out.println("");



        SortInserts.insertionSort2(training, 1, 6);
        System.out.println("Вставка с пересенными  до -6   ");
        for (int j = 0; j < firth2.length; j++) {
            System.out.print("    ");
            System.out.print(firth2[j]);
        }
        System.out.println("");



        SortInserts.insertionSort2(training, 6, 10);
        System.out.println("Вставка с пересенными  диапозон (6  10)  ");
        for (int j = 0; j < firth3.length; j++) {
            System.out.print("    ");
            System.out.print(firth3[j]);
        }
        System.out.println("");



        SortInserts.insertionSort(training);
        System.out.println("Второй без диапазона  ");
        for (int j = 0; j < firth.length; j++) {
            System.out.print("    ");
            System.out.print(firth[j]);
        }

    }
}