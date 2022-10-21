package br.com.ada.estruturadedados.fila;

public class FilaImpl<T> implements Fila<T> {
    //Fila circular
    private final T[] elements;
    private int front;
    private int rear;

    public FilaImpl(int size) {
        this.elements = (T[]) new Object[size];
        this.front = -1;
        this.rear = -1;
    }

    @Override
    public void enqueue(T data) {
        if(!isFull()){
            if(isEmpty()){
                this.front++;
            }
            elements[++this.rear] = data;
        }else{
            throw new RuntimeException("Fila cheia");
        }
    }

    @Override
    public T dequeue() {
        if(!isEmpty()){
            T element = elements[this.front];
            elements[this.front] = null;
            if(this.front == this.rear){
                this.front = -1;
                this.rear = -1;
                return element;
            }
            if(this.front == size()-1){
                this.front = 0;
                return element;
            }
            this.front++;
            return element;
        }else{
            throw new RuntimeException("Fila vazia");
        }
    }

    @Override
    public T front() {
        return elements[this.front];
    }

    @Override
    public int size() {
        return elements.length;
    }

    @Override
    public boolean isEmpty() {
        return ((this.rear == -1) && (this.front == -1));
    }

    @Override
    public boolean isFull() {
        if(this.front == 0 && this.rear == (size()-1)){
            return true;
        } else if (this.front - this.rear == 1) {
            return true;
        }else{
            return false;
        }
    }
}
