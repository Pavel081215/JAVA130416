package zagrebelnyy.eight;

/**
 * Created by Pavel on 22.01.2016.
 */
public class Alphabet {
    public static char[] alphabetsmall(int mod) {

        final char[] alphabetSmall = new char[mod];
        int k = 97; // ��������� ����� ���� �� �������  ASCII ��� ��������� ��������� ����
        for (int i = 0; i < alphabetSmall.length; i++) {
            alphabetSmall[i] = (char) k;
            k++;
        }
        return alphabetSmall;
    }

    public static char[] alphabeBig (int mod) {

        final char[] alphabetBig = new char[mod];
        int k = 65;// ��������� ����� ���� �� �������  ASCII ��� ������� ��������� ����
        for (int i = 0; i < alphabetBig.length; i++) {
            alphabetBig[i] = (char) k;
            k++;
        }
        return alphabetBig;
    }
}
