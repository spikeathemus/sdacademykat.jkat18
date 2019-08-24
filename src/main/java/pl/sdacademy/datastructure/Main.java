package pl.sdacademy.datastructure;

import pl.sdacademy.datastructure.queue.ArrayQueue;
import pl.sdacademy.datastructure.queue.LinkedQueue;
import pl.sdacademy.datastructure.queue.Queue;

public class Main {
    public static void main(String[] args) {
//Queue<String> stringQueue = new ArrayQueue<>();
Queue<String> stringQueue = new LinkedQueue<>();
stringQueue.enqueue("Darek");
stringQueue.enqueue("Stefan");
stringQueue.enqueue("Jolanta");
stringQueue.enqueue("Anna");


        System.out.println(stringQueue.dequeue());  //pierwszy zejdzie z czoła Darek
        System.out.println(stringQueue.dequeue());  //potem Stefan
        System.out.println(stringQueue.dequeue());
    }
}
