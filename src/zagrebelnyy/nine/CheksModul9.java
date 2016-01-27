package zagrebelnyy.nine;

import zagrebelnyy.eight.oopforme.file.File;
import zagrebelnyy.eight.oopforme.file.Audio;
import zagrebelnyy.eight.oopforme.file.Image;
import zagrebelnyy.eight.oopforme.file.Text;


import java.util.ArrayList;

/**
 * Created by Pavel on 22.01.2016.
 */
public class CheksModul9 {
    public static void main(String[] args) throws Exception {
        String code = "abc";
        int key = 48;
    /*    System.out.println("начальное значение строка " + code);
        String encode = Caesarcode.encode(code, key);
        System.out.println("Закодированное строка " + encode);
        String decode = Caesarcode.decode(encode, key);
        System.out.println("Раскодированное строка " + decode);*/

        ArrayList<File> arrayList = new ArrayList();
        arrayList.add(new Audio("first"));
        arrayList.add(new Image("second"));
        arrayList.add(new Text("first"));
        arrayList.add(new Audio("second"));


        String codecoll = arrayList.toString();
        System.out.println("начальное значение коллекция " + codecoll);
        String encodecoll = Caesarcode.encode(codecoll, key);
        System.out.println("Закодированное коллекция " + encodecoll);
        String decodecoll = Caesarcode.decode(encodecoll, key);
        System.out.println("Раскодированное коллекция " + decodecoll);
    }
}
