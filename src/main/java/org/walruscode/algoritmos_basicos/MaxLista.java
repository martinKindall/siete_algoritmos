package org.walruscode.algoritmos_basicos;

import org.walruscode.algoritmos_basicos.estructuras.Nodo;

public class MaxLista {

    // tiempo: O(n)
    // espacio: O(n)
    private static int maximo(Nodo cabeza) {
        if (cabeza == null) throw new IllegalArgumentException("La lista no puede ser nula");

        if (cabeza.siguiente == null) return cabeza.val;

        int maximoSiguiente = maximo(cabeza.siguiente);

        return Math.max(cabeza.val, maximoSiguiente);
    }


    public static void main(String[] args) {
        // 1 -> 2 -> 30 -> 20301 -> 3 -> 500
        Nodo ej1 = new Nodo(1, new Nodo(2, new Nodo(30, new Nodo(20301, new Nodo(3, new Nodo(500))))));

        System.out.println(maximo(ej1));   // 20301
    }
}
