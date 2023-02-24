// import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;

/**
 * Найдите сумму всех элементов LinkedList, сохраняя все элементы в списке.
 * Используйте итератор
 */

public class task_03 {
    public static void main(String[] args) {
        int count = 10;
        LinkedList<Integer> linkedList = new LinkedList<>();
        getLinkedListRndInt(linkedList, count);
        
        int sum = sumElemsLinkedList(linkedList);

        System.out.println(linkedList);
        System.out.println(sum);
    }

    public static int sumElemsLinkedList(LinkedList<Integer> list) {
        int sum = 0;

        for (Integer integer : list) {                                                   // получим сумму всех элементов linkedLIst
            sum += integer;
        }

        // Iterator<Integer> iterator = list.iterator();
        // while (iterator.hasNext()) {
        //     sum += iterator.next();
        // }

        return sum;
    }

    public static void getLinkedListRndInt(LinkedList<Integer> list, int countElems) {
        Random rnd = new Random();

        for (int i = 0; i < countElems; i++) {
            list.add(rnd.nextInt(-100, 100));                                      // получим список рандомных чисел с нужным количеством элементов
        }
    }
}