package org.walruscode.algoritmos_basicos.estructuras;

public class Arbol {

    public int val;

    public Arbol izquierda;

    public Arbol derecha;

    public Arbol(int val) {
        this.val = val;
    }

    public Arbol(int val, Arbol izquierda, Arbol derecha) {
        this.val = val;
        this.izquierda = izquierda;
        this.derecha = derecha;
    }
}
