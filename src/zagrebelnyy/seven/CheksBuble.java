package zagrebelnyy.seven;

/**
 * Created by P.Zagrebelniy on 23.12.2015.
 */
public class CheksBuble {
    public static void main(String[] args) {
        int[] training = {-1222, 3333533, 3, 4, 655555555, 7, -8888, 5, 2, 22, 44, 999999999};
        //Создаються 4 массива - одинаковых, каждый будет изменён в своём методе, результат должен быть одинакоый
        int[] first = training;
        int[] second = training;
        int[] first1 = training;
        int[] second1 = training;


        SortBubble.bubbleSortSecond(first);
        PrintCheks.printCheks(" Общий №1 - контрольный   ", first);
        SortBubble.bubbleSortSecondUniversal(second);
        PrintCheks.printCheks(" С методом №1  универсальный ", second);

        SortBubble.bubbleSortFirst (first);
        PrintCheks.printCheks(" Общий №2 - контрольный   ", first1);
        SortBubble.bubbleSortFirstUniversal(second);
        PrintCheks.printCheks(" С методом №2  универсальный ", second1);

    }
}