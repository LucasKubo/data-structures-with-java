package br.com.ada.estruturadedados.arvore.buscabinaria;

import java.util.LinkedList;

//arvore de busca binária
public class Tree {
    private int data;
    private Tree dir;
    private Tree esq;

    public Tree(int data) {
        this.data = data;
    }

    public void insert(int data) {
        insert(this,data);
    }

    private void insert(Tree tree, int data) {
        if(data > tree.data){
            if(tree.dir == null){
                tree.dir = new Tree(data);
            }else {
                insert(tree.dir, data);
            }
        }else {
            if(tree.esq == null){
                tree.esq = new Tree(data);
            }else {
                insert(tree.esq, data);
            }
        }
    }

    public boolean exists(int dada) {
        return false;
    }

    public void preOrder() {
        preOrder(this);
    }

    private void preOrder(Tree tree) {
        if (tree != null) {
            System.out.println(tree.data);
            preOrder(tree.esq);
            preOrder(tree.dir);
        }
    }

    public void inOrder() {
        inOrder(this);
    }

    private void inOrder(Tree tree) {
        if (tree != null) {
            inOrder(tree.esq);
            System.out.println(tree.data);
            inOrder(tree.dir);
        }
    }

    public void posOrder() {
        posOrder(this);
    }

    private void posOrder(Tree tree) {
        if (tree != null) {
            posOrder(tree.esq);
            posOrder(tree.dir);
            System.out.println(tree.data);
        }
    }

    public void bfs() {
        LinkedList<Tree> fila = new LinkedList<>();

        fila.addFirst(this);

        while(!fila.isEmpty()) {
            var no = fila.removeFirst();

            if (no.esq != null) fila.addLast(no.esq);
            if (no.dir != null) fila.addLast(no.dir);

            System.out.println(no.data);
        }
    }
}
