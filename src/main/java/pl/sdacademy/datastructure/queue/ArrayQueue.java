package pl.sdacademy.datastructure.queue;

import java.util.Arrays;

public class ArrayQueue<T>implements Queue<T> {
    private Object[] elements;

    public ArrayQueue(){
        this.elements= new Object[0];
    }

    public void enqueue(T element) {
    elements = Arrays.copyOf(elements, elements.length+1);

    elements[elements.length-1] = element;
    }

    public T dequeue() {
        if(elements.length ==0){
        return null;
        }
        T element = (T)elements[0];  //można to (T) wsadzić wyżej gdzieś
        elements = Arrays.copyOfRange(elements, 1 ,elements.length);  // trzecia wartość pokazuje koniec bez tej wartości
        return element;
    }
}
