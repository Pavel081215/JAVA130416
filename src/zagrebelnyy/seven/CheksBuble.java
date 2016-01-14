package zagrebelnyy.seven;

/**
 * Created by P.Zagrebelniy on 23.12.2015.
 */
public class CheksBuble {
    public static void main(String[] args) {

        //Создаються 4 массива - одинаковых, каждый будет изменён в своём методе, результат должен быть одинакоый для первых двух и следующих  двух
        int[] first = {-1222, 3333533, 3, 4, 655555555, 7, -8888, 5, 2, 22, 44, 999999999};
        int[] second = {-1222, 3333533, 3, 4, 655555555, 7, -8888, 5, 2, 22, 44, 999999999};
        int[] first1 = {-1222, 3333533, 3, 4, 655555555, 7, -8888, 5, 2, 22, 44, 999999999};
        int[] second1 = {-1222, 3333533, 3, 4, 655555555, 7, -8888, 5, 2, 22, 44, 999999999};

        SortBubble.bubbleSortIncrease(first);
        PrintCheks.printCheks(" Общий №1(Убывание) - контрольный   ", first);
        SortBubble.bubbleSortIncreaseLightRefactor(second);
        PrintCheks.printCheks(" С методом №1 (Убывание) универсальный ", second);

        SortBubble.bubbleSortDecrease(first1);
        PrintCheks.printCheks(" Общий №2 (Увеличение) - контрольный   ", first1);
        SortBubble.bubbleSortDecreaseLightRefactor(second1);
        PrintCheks.printCheks(" С методом №2 (Увеличение) универсальный ", second1);

    }
}