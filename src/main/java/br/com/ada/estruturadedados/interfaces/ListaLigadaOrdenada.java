package br.com.ada.estruturadedados.interfaces;

public interface ListaLigadaOrdenada<T extends Comparable<T>> {

    void inserir(T data);

    boolean remover(T data);

    void imprimir();
}
