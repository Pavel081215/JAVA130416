package codegym;

/**
 * Created by Pavel on 07.02.2016.
 */
public class SetZero {

   // public static void main(String[] args) {
     //   SetZero  setZero = new SetZero();
       // System.out.println(setZero.set(, ));


   // }
    public int set(int num, int i) {
        int temp = 1<<(i-1); // ���� ��������
        int mask = ~ temp; // �������� ������

        int result = num & mask;

        return  result;


    }
}
