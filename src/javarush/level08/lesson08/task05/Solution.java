package com.javarush.test.level08.lesson08.task05;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.
*/

public class Solution
{
    public static void main(String[] args){




        HashMap<String, String> map =   createMap();
        removeTheFirstNameDuplicates(map);
        System.out.println(map);
    }



    public static HashMap<String, String> createMap()
    {
        Map<String, String> map  = new HashMap<String, String>();
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
        return (HashMap) map;
       //напишите тут ваш код
    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map)
    {
        Map<String, String> mapcopy  = new HashMap<String, String>(map);

        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();


        while (iterator.hasNext())

        //for (Map.Entry<String, String> pair: map.entrySet())
        {
            Map.Entry<String, String> pair = iterator.next();
           // String key = pair.getKey();
            int count =0;
            for (Map.Entry<String, String> pair1: mapcopy.entrySet())
            {

                if (pair.getValue().equals(pair1.getValue()))
                {
                    count ++;
                }
            }

            System.out.println(count);
            if (count >= 2)
            {
                iterator.remove();
                System.out.println("Удаляет");
            }


        }

       //напишите тут ваш код

    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value)
    {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair: copy.entrySet())
        {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }
}
