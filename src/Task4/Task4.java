package Task4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> map= new HashMap<String,ArrayList<String>>();
        Scanner sc = new Scanner(System.in);
        String key,value;

        for (int i = 0; i < 3; i++) {
            System.out.println("Введите название города ");
            key=sc.nextLine();
            System.out.println("Введите фамилию семьи ");
            value=sc.nextLine();

            // для обеспечения множественных значений по одному ключу
            // сделал Мар у которого в значения аррейлист с фамилиями жильцов данного города

            if (map.containsKey(key)){map.get(key).add(value);}else
            {map.put(key, new ArrayList<String>());
                map.get(key).add(value);}}

        System.out.println("Введите город, жильци которого вас интересует :");
        key=sc.nextLine();
        System.out.println("В городе "+key+" проживают :"+ map.get(key));

        System.out.println(map);



    }
}

/*  Программа определяет, какая семья (фамилия) живёт в городе:

        Пример ввода: Ивановы, Киев
                      Петровы, Лондон
                      Абрамовичи,Лондон

        Пример вывода:
        ·         Абрамовичи

 */