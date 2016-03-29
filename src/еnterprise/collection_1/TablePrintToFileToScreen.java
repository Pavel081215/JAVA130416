package еnterprise.collection_1;

import java.io.BufferedWriter;
import java.io.FileWriter;

/**
 * Created by Pavel on 13.03.2016.
 */
public class TablePrintToFileToScreen {

    String[] infoInTable = {"add", "get", "remove", "contains", "populate", "iterator.add", "iterator.remove", "ArrayList", "LinkedList", "HashSet", "TreeSet"};


    public void entryInFileTable(double[] resultList, double[] resultSet, int[] options) throws Exception {
        String nameFile = "Test";
        BufferedWriter out = new BufferedWriter(new FileWriter("src//еnterprise//collection_1//" + nameFile + ".txt"));

        int stepList = 0;
        int stepSet = 0;
        String temp = null;
        for (int i = 0; i < options.length; i++) {
            temp = ("Результаты измерений при " + options[i]);
            out.write(temp);
            out.write("\r\n");
            out.write("==========================================================================");
            out.write("\r\n");
            out.write("|          |" + infoInTable[0] + " |" + infoInTable[1] + "|" + infoInTable[2] + "|" + infoInTable[3] + "|" + infoInTable[4] + "|" + infoInTable[5] + "|" + infoInTable[6] + "|");
            out.write("\r\n");
            out.write("---------------------------------------------------------------------------");
            out.write("\r\n");
            out.write("|" + infoInTable[7] + " |" + resultList[i + stepList] + "|" + resultList[i + 1 + stepList] + "|" + resultList[i + 2 + stepList] + "|" + resultList[i + 3 + stepList] + "|" + resultList[i + 4 + stepList] + "|" + resultList[i + 5 + stepList] + "|" + resultList[i + 6 + stepList] + "|");
            out.write("\r\n");
            out.write("---------------------------------------------------------------------------");
            out.write("\r\n");
            out.write("|" + infoInTable[8] + "|" + resultList[i + 7 + stepList] + "|" + resultList[i + 8 + stepList] + "|" + resultList[i + 9 + stepList] + "|" + resultList[i + 10 + stepList] + "|" + resultList[i + 11 + stepList] + "|" + resultList[i + 12 + stepList] + "|" + resultList[i + 13 + stepList] + "|");
            out.write("\r\n");
            out.write("--------------------------------------------------------------------------");
            out.write("\r\n");
            out.write("|" + infoInTable[9] + "   |" + resultSet[i + stepSet] + "|" + 0.0 + "|" + resultSet[i + 1 + stepSet] + "|" + resultSet[i + 2 + stepSet] + "|" + resultSet[i + 3 + stepSet] + "|" + 0.0 + "|" + 0.0 + "|");
            out.write("\r\n");
            out.write("--------------------------------------------------------------------------");
            out.write("\r\n");
            out.write("|" + infoInTable[10] + "   |" + resultSet[i + 4 + stepSet] + "|" + 0.0 + "|" + resultSet[i + 5 + stepSet] + "|" + resultSet[i + 6 + stepSet] + "|" + resultSet[i + 7 + stepSet] + "| " + 0.0 + "|" + 0.0 + "|");
            out.write("\r\n");
            out.write("--------------------------------------------------------------------------");
            out.write("\r\n");
            out.write("\r\n");
            out.write("\r\n");
            out.write("\r\n");
            out.write("\r\n");
            if (i == 1) {
                stepList = 12;
                stepSet = 6;
            } else {
                stepList = 13;
                stepSet = 7;
            }

        }
        out.close();
    }

    public void entryPrintTable(double[] resultList, double[] resultSet, int[] options) throws Exception {


        int stepList = 0;
        int stepSet = 0;

        for (int i = 0; i < options.length; i++) {

            System.out.println("Результаты измерений при " + options[i]);
            System.out.println("==========================================================================");
            System.out.println("|          |" + infoInTable[0] + "|" + infoInTable[1] + "|" + infoInTable[2] + "|" + infoInTable[3] + "|" + infoInTable[4] + "|" + infoInTable[5] + "|" + infoInTable[6] + "|");
            System.out.println("--------------------------------------------------------------------------");
            System.out.println("|" + infoInTable[7] + " |" + resultList[i + stepList] + "|" + resultList[i + 1 + stepList] + "|" + resultList[i + 2 + stepList] + "| " + resultList[i + 3 + stepList] + "|" + resultList[i + 4 + stepList] + "|" + resultList[i + 5 + stepList] + "|" + resultList[i + 6 + stepList] + "|");
            System.out.println("--------------------------------------------------------------------------");
            System.out.println("|" + infoInTable[8] + "|" + resultList[i + 7 + stepList] + "|" + resultList[i + 8 + stepList] + "|" + resultList[i + 9 + stepList] + "|" + resultList[i + 10 + stepList] + "|" + resultList[i + 11 + stepList] + "|" + resultList[i + 12 + stepList] + "|" + resultList[i + 13 + stepList] + "|");
            System.out.println("--------------------------------------------------------------------------");
            System.out.println("|" + infoInTable[9] + "   |" + resultSet[i + stepSet] + "|" + 0.0 + "|" + resultSet[i + 1 + stepSet] + "|" + resultSet[i + 2 + stepSet] + "|" + resultSet[i + 3 + stepSet] + "|" + 0.0 + "|" + 0.0 + "|");
            System.out.println("--------------------------------------------------------------------------");
            System.out.println("|" + infoInTable[10] + "   |" + resultSet[i + 4 + stepSet] + "|" + 0.0 + "|" + resultSet[i + 5 + stepSet] + "|" + resultSet[i + 6 + stepSet] + "|" + resultSet[i + 7 + stepSet] + "|" + 0.0 + "|" + 0.0 + "|");
            System.out.println("--------------------------------------------------------------------------");
            if (i == 1) {
                stepList = 12;
                stepSet = 6;
            } else {
                stepList = 13;
                stepSet = 7;
            }

        }


    }
}






