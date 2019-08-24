package pl.sdacademy.datastructure.queue;

public class LinkedQueue<T> implements Queue<T>{

    private Link<T> head;

    @Override
    public void enqueue(T element){
        Link<T> newLink = new Link<>(element);
        if (head == null){
            head = newLink;
        }
        else{
            Link<T> link = head;
            while(link.getNext()!=null){
                link = link.getNext();
            }
            link.setNext(newLink);
        }
    }

    @Override
    public T dequeue(){
        if(head ==null){

        return null;
        }
        T element = head.getValue();
        head = head.getNext();
        return element;
    }
}
