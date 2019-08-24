package pl.sdacademy.datastructure.queue;

public class Link<T> {
    private T value;
    private Link<T> next;

    public Link(T value){
        this.value = value;
    }

    public Link<T> getNext() {
        return next;
    }

    public void setNext(Link<T> next) {
        this.next = next;
    }

    public T getValue() {
        return value;
    }
}
