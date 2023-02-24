package task_02;

import java.util.LinkedList;

/**
 * Реализуйте очередь с помощью LinkedList со следующими методами:
 * enqueue() - помещает элемент в конец очереди,
 * dequeue() - возвращает первый элемент из очереди и удаляет его,
 * first() - возвращает первый элемент из очереди, не удаляя.
 */

public class Main {
    public static void main(String[] args) {
        LinkedListUtils lUtils = new LinkedListUtils();
        LinkedList<Integer> list = new LinkedList<>();
        System.out.println(list);

        lUtils.enqueue(list);
        lUtils.enqueue(list);
        lUtils.enqueue(list);
        lUtils.enqueue(list);

        System.out.println(list);
        
        System.out.println(lUtils.dequeue(list));
        System.out.println(list);

        System.out.println(lUtils.first(list));
        System.out.println(list);
    }
}