package org.walruscode.algoritmos_basicos.estructuras;

public class Nodo {

    public int val;

    public Nodo siguiente;

    public Nodo(int val) {
        this.val = val;
    }

    public Nodo(int val, Nodo siguiente) {
        this.val = val;
        this.siguiente = siguiente;
    }
}
