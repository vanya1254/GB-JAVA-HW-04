package task_02;

import java.util.LinkedList;
import java.util.Random;

/**
 * enqueue() - помещает элемент в конец очереди,
 * dequeue() - возвращает первый элемент из очереди и удаляет его,
 * first() - возвращает первый элемент из очереди, не удаляя.
 */

public class LinkedListUtils {

    private LinkedList<Integer> linkedList = new LinkedList<>();

    LinkedList<Integer> enqueue(){
        Random rnd = new Random();
        linkedList.addLast(rnd.nextInt(-100, 100));

        return linkedList;
    }

    Integer dequeue(){
        if (linkedList.size() > 0) {
            return linkedList.remove(0);
        } else {
            return null;
        }
    }

    Integer first(){
        if (linkedList.size() > 0) {
            return linkedList.getFirst();
        } else {
            return null;
        }
    }
}
