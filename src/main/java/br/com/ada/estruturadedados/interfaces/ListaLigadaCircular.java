package br.com.ada.estruturadedados.interfaces;

public interface ListaLigadaCircular<T> {

    void inserir(T data);

    boolean remover(T data);

    void imprimir();
}
