package com.javarush.test.level08.lesson08.task03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/

public class Solution
{
    public static void main(String[] args) {
        HashMap <String, String> map = createMap();
        getCountTheSameLastName(map,"Куркович");
        getCountTheSameFirstName(map, "Валя");
    }

    public static HashMap<String, String> createMap()
    {

        HashMap<String,String> map = new HashMap<String, String>();

        map.put("Ткаченко","Инна");
        map.put("Щербак","Ина");
        map.put("Ревунова","Алена");
        map.put("Куркович","Валя");
        map.put("Неволько","виктор");
        map.put("Козачук","Вячеслав");
        map.put("Трубакова","Валя");
        map.put("Соловей","Наташа");
        map.put("Мрих","Игорь");
        map.put("Васичкин","Инна");
        return map;
        //напишите тут ваш код

    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name)
    {
        int count =0;
        for (Map.Entry<String, String> pair : map.entrySet())
        {String key = pair.getValue();
            if (name.equals(key))
        {
            count ++;
        }

        }

        System.out.println(count);
       return count;

    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String familiya)
    {
        int count =0;
        for (Map.Entry<String, String> pair : map.entrySet())
        { String key = pair.getKey();
            if (familiya.equals(key)){
            count ++; }
        }

        System.out.println(count);
        return count;

        //напишите тут ваш код

    }
}
