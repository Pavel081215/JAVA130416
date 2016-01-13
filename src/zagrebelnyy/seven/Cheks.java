package zagrebelnyy.seven;

/**
 * Created by P.Zagrebelniy on 23.12.2015.
 */
public class Cheks {
    public static void main(String[] args) {
        int[] training = {-1222, 3333533, 3, 4, 655555555, 7, -8888, 5, 2, 22, 44, 999999999};
        //Создаються 5 массива - одинаковых, каждый будет изменён в своём методе
        int[] first = training;
        int[] second = training;
        int[] firth = training;
        int[] firth2 = training;
        int[] firth3 = training;

// Использовано антипатерн - дублирование строк
        PrintCheks.printCheks(" По умолчанию   ",first );
        SortInserts.insertionSort2(training, 1, 5);
        PrintCheks.printCheks("Вставка с пересенными  до -5   ",second );
        SortInserts.insertionSort(training);
        PrintCheks.printCheks("Второй без диапазона  ",firth );
        SortInserts.insertionSort2(training, 1, 6);
        PrintCheks.printCheks("Вставка с пересенными  до -6   ",firth2 );
        SortInserts.insertionSort2(training, 6, 10);
        PrintCheks.printCheks("Вставка с пересенными  диапозон (6  10)  ",firth3 );





    }
}