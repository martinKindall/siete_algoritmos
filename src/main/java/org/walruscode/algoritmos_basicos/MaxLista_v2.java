package org.walruscode.algoritmos_basicos;

import org.walruscode.algoritmos_basicos.estructuras.Nodo;

public class MaxLista_v2 {

    // tiempo: O(n)
    // espacio: O(1)
    private static int maximo(Nodo cabeza) {
        if (cabeza == null) throw new IllegalArgumentException("La lista no puede ser nula");

        if (cabeza.siguiente == null) return cabeza.val;

        int max = Integer.MIN_VALUE;

        while (cabeza != null) {
            max = Math.max(cabeza.val, max);

            cabeza = cabeza.siguiente;
        }

        return max;
    }

    public static void main(String[] args) {
        // 1 -> 2 -> 30 -> 20301 -> 3 -> 500
        Nodo ej1 = new Nodo(1, new Nodo(2, new Nodo(30, new Nodo(20301, new Nodo(3, new Nodo(500))))));

        System.out.println(maximo(ej1));   // 20301
    }
}
