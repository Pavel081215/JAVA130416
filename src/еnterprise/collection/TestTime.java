package еnterprise.collection;

import java.util.*;


public class TestTime {
    int quantityMeasurement = 100;


    public double testTimePopulate(Collection c, int size) throws Exception { // метод заполнения коллекции
        double result = 0;
        for (int k = 0; k < quantityMeasurement; k++) {
            result += getTimeOneOperationPopulate(c, size);
            c.clear();
        }
        return result / quantityMeasurement;
    }

    public int getTimeOneOperationPopulate(Collection c, int size) { // метод вспомогательный для заполнения колекии
        Date currentTime = new Date();
        for (int i = 0; i < size; i++) {
            c.add(i);
        }
        Date newTime = new Date();
        return (int) newTime.getTime() - (int) currentTime.getTime();
    }


    public double testTimeGetList(List c, int size) throws Exception { // метод получения из коллекции
        double result = 0;
        for (int i = 0; i < size; i++) {
            c.add(i);
        }

        for (int k = 0; k < quantityMeasurement; k++) {
            result += getTimeOneOperationGetList(c, size);
        }
        return result / quantityMeasurement;

    }

    public int getTimeOneOperationGetList(List c, int size) {  // метод вспомогательный для получения из коллекции
        Date currentTime = new Date();
        for (int i = 0; i < size; i++) {
            c.get(i);
        }
        Date newTime = new Date();
        return (int) newTime.getTime() - (int) currentTime.getTime();
    }


    public double testTimeRemove(Collection c, int size) throws Exception { //метод удаления
        double result = 0;
        for (int i = 0; i < size; i++) {
            c.add(i);
        }

        for (int k = 0; k < quantityMeasurement; k++) {
            result += getTimeOneOperationRemove(c, size);
        }
        return result / quantityMeasurement;

    }

    public int getTimeOneOperationRemove(Collection c, int size) { //метод вспомогательный для удаления
        Date currentTime = new Date();
        for (int i = 0; i < size; i++) {
            c.remove(i);
        }
        Date newTime = new Date();
        return (int) newTime.getTime() - (int) currentTime.getTime();
    }


    public double testTimeContains(Collection c, int size) throws Exception { // метод для поиска в коллекции
        double result = 0;
        for (int i = 0; i < size; i++) {
            c.add(i);
        }

        for (int k = 0; k < quantityMeasurement; k++) {
            result += getTimeOneOperationContains(c, size);
        }
        return result / quantityMeasurement;


    }

    public int getTimeOneOperationContains(Collection c, int size) {  // метод вспомогательный для поиска в коллекции
        Date currentTime = new Date();
        for (int i = 0; i < size; i++) {
            c.contains(i);
        }
        Date newTime = new Date();
        return (int) newTime.getTime() - (int) currentTime.getTime();
    }


    public double testTimeAdd(List c, int size) throws Exception { // метот добавления в колекцию по индексу
        double result = 0;
        for (int k = 0; k < quantityMeasurement; k++) {
            result += getTimeOneOperationAdd(c, size);
            c.clear();
        }
        return result / quantityMeasurement;

    }

    public int getTimeOneOperationAdd(List c, int size) { // метод вспомогательный для заполнения колекии по индексу
        Date currentTime = new Date();
        for (int i = 0; i < size; i++) {
            c.add(i, i + 8);
        }
        Date newTime = new Date();
        return (int) newTime.getTime() - (int) currentTime.getTime();
    }


    public double testTimeAddSet(Set c, int size) throws Exception { // метот добавления в колекцию CET
        double result = 0;
        for (int k = 0; k < quantityMeasurement; k++) {
            result += getTimeOneOperationAddSet(c, size);
            c.clear();
        }
        return result / quantityMeasurement;

    }


    public int getTimeOneOperationAddSet(Set c, int size) { // метод вспомогательный для заполнения колекии по индексу CET
        Date currentTime = new Date();
        for (int i = 0; i < size; i++) {
            c.add(i);
        }
        Date newTime = new Date();
        return (int) newTime.getTime() - (int) currentTime.getTime();
    }


    public double testTimeIteratorAdd(List c, int size) throws Exception {  // метод добавление через итератор
        double result = 0;
        for (int i = 0; i < 5; i++) {
            c.add(i);
        }
        for (int k = 0; k < quantityMeasurement; k++) {
            result += getTimeOneOperationIteratorAdd(c, size);
            c.clear();
        }
        return result / quantityMeasurement;

    }

    public int getTimeOneOperationIteratorAdd(List c, int size) { // метод вспомогательный для добавление через итератор

        Date currentTime = new Date();
        for (int i = 0; i < size/1000 ; i++) {
            ListIterator<Integer> iterator = c.listIterator();
            while (iterator.hasNext()) {
                int d = iterator.next();
                iterator.add(3);
            }
        }
        Date newTime = new Date();

        return (int) newTime.getTime() - (int) currentTime.getTime();
    }


    public double testTimeIteratorRemove(List c, int size) throws Exception {// метод для удаления через итератор
        double result = 0;
        for (int i = 0; i < 10; i++) {
            c.add(i);
        }
        for (int k = 0; k < quantityMeasurement; k++) {
            result += getTimeOneOperationIteratorRemove(c, size);
            c.clear();
        }
        return result / quantityMeasurement;


    }

    public int getTimeOneOperationIteratorRemove(List c, int size) { // метод вспомогательный для  удаления через итератор

        Date currentTime = new Date();
        for (int i = 0; i < size; i++) {
            ListIterator<Integer> iterator = c.listIterator();
            while (iterator.hasNext()) {
                int d = iterator.next();
                iterator.remove();
            }
        }
        Date newTime = new Date();

        return (int) newTime.getTime() - (int) currentTime.getTime();
    }




}

