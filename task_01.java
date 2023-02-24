import java.util.LinkedList;
import java.util.Random;

/**
 * Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который
 * вернет “перевернутый” список. Постараться не обращаться к листу по индексам.
 */

public class task_01 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        int count = 10;
        getLinkedListRndInt(linkedList, count);
        System.out.println(linkedList);

        reverseLinkedList(linkedList);
        System.out.println(linkedList);
    }

    public static void getLinkedListRndInt(LinkedList<Integer> list, int countElems) {
        Random rnd = new Random();

        for (int i = 0; i < countElems; i++) {
            list.add(rnd.nextInt(-100, 100));                                            // получим список рандомных чисел с нужным количеством элементов
        }
    }

    public static void reverseLinkedList(LinkedList<Integer> list) {
        LinkedList<Integer> rList = new LinkedList<>();

        while (list.size() > 0) {
            rList.addLast(list.removeLast());                                                  // создает новый linkedList для переворачивания изначального
        }
        list.addAll(rList);
    }
}