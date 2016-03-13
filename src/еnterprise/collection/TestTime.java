package еnterprise.collection;

import java.util.Collection;
import java.util.Date;


public class TestTime {


    public double testTimePopulate(Collection c, int size) throws Exception {
        int quantityMeasurement = 100;
        double result = 0;
        for (int k = 0; k < quantityMeasurement; k++) {
            result += getTimeOperation(c, size);
            c.clear();
        }
        return result / quantityMeasurement;
    }

    public int getTimeOperation(Collection c, int size) {
        Date currentTime = new Date();
        for (int i = 0; i < size; i++) {
            c.add(i);
        }
        Date newTime = new Date();
        return 5;//(int) newTime.getTime() - (int) currentTime.getTime();
    }





    public long testTimeGet(Collection c, int size) throws Exception {

        return 2;

    }

    public long testTimeRemove(Collection c, int size) throws Exception {

        return 3;

    }

    public long testTimeContains(Collection c, int size) throws Exception {

        return 4;

    }

    public long testTimeAdd(Collection c, int size) throws Exception {

        return 1;

    }

    public long testTimeIteratorAdd(Collection c, int size) throws Exception {

        return 6;

    }

    public long testTimeIteratorRemove(Collection c, int size) throws Exception {

        return 7;

    }
}

