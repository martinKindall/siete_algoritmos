package org.walruscode.algoritmos_basicos;

import org.walruscode.algoritmos_basicos.estructuras.Arbol;

public class MaxArbol {

    // Busqueda en la Profundidad - variante post order
    // tiempo: O(n)
    // espacio: O(n) (arbol no balanceado)
    private static int maximo(Arbol raiz) {
        if (raiz == null) throw new IllegalArgumentException("El arbol no puede ser nulo");

        if (raiz.izquierda == null && raiz.derecha == null) return raiz.val;

        if (raiz.izquierda != null && raiz.derecha != null) {
            int maxIzq = maximo(raiz.izquierda);
            int maxDer = maximo(raiz.derecha);

            return Math.max(raiz.val, Math.max(maxIzq, maxDer));
        }

        if (raiz.izquierda != null) {
            int maxIzq = maximo(raiz.izquierda);

            return Math.max(raiz.val, maxIzq);
        }

        int maxDer = maximo(raiz.derecha);

        return Math.max(raiz.val, maxDer);
    }


    public static void main(String[] args) {
        /*
                               250
                              /   \
                             3     10
                            / \      \
                           10  6      414
                              / \     /
                             4   7   55
         */

        Arbol ej1 = new Arbol(250,
                new Arbol(3,
                        new Arbol(10),
                        new Arbol(6, new
                                Arbol(4),
                                new Arbol(7))),
                new Arbol(10,
                        null,
                        new Arbol(414,
                                new Arbol(55),
                                null)));

        System.out.println(maximo(ej1));
    }
}
