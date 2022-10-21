package br.com.ada.estruturadedados.interfaces;

public interface Sortable<T extends Comparable<T>> {

    T[] sort(T[] elements);
}
