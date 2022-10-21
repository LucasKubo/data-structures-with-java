package br.com.ada.estruturadedados.pilha;

public interface Pilha<T> {

    void push(T data);

    T pop();

    T top();

    int size();

    boolean isEmpty();

    boolean isFull();
}
