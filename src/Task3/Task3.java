package Task3;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;

public class Task3 {


    public static LinkedList<Integer> getIntegerList(int n) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < 3; i++) {
            System.out.println("Введіть Ціле число");
            linkedList.add(scanner.nextInt());
            linkedList.sort(Comparator.nullsFirst(Integer::compareTo));

        }
        return linkedList;
    }

    public static int getMinimum(LinkedList list) {
        Collections.sort(list);
        return (int) list.peekFirst();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть число N");
        int n = scanner.nextInt();

        System.out.println("minimal число з введених : " + getMinimum(getIntegerList(n)));

    }

}
/*    Минимальное из N чисел(использовать LinkedList):

        1.       Ввести с клавиатуры число N.

        2.       Считать N целых чисел и заполнить ими список - метод getIntegerList.

        3.       Найти минимальное число среди элементов списка - метод getMinimum.

 */