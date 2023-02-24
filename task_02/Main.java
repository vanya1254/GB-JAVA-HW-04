package task_02;

/**
 * Реализуйте очередь с помощью LinkedList со следующими методами:
 * enqueue() - помещает элемент в конец очереди,
 * dequeue() - возвращает первый элемент из очереди и удаляет его,
 * first() - возвращает первый элемент из очереди, не удаляя.
 */

public class Main {
    public static void main(String[] args) {
        LinkedListUtils list = new LinkedListUtils();
        list.enqueue();
        System.out.println(list);
    }
}