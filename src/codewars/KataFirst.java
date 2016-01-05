package codewars;

public class KataFirst {
    public static int mostFrequentItemCount(int[] collection) {
        // Do your magic :)
        int itemCount = 0;


        for (int i = 0; i < collection.length; i++) {
            int itemCountex = 0;

            for (int j = 0; j < collection.length; j++) {

                if (collection[i] == collection[j]) {
                    itemCountex++;
                }
            }


            if (itemCount < itemCountex) {
                itemCount = itemCountex;

            }

        }


        return itemCount;
    }
}
