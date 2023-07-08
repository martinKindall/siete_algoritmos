package org.walruscode.algoritmos_basicos;

import org.walruscode.algoritmos_basicos.estructuras.Arbol;

import java.util.Stack;

public class MaxArbol_v2 {

    // Busqueda en la Profundidad (iterativo) - variante pre order
    // tiempo: O(n)
    // espacio: O(n) (arbol no balanceado)
    private static int maximo(Arbol raiz) {
        if (raiz == null) throw new IllegalArgumentException("El árbol no puede ser nulo");

        Stack<Arbol> pila = new Stack<>();
        pila.push(raiz);

        int maximo = Integer.MIN_VALUE;

        while (!pila.isEmpty()) {
            Arbol tope = pila.pop();

            if (tope == null) continue;

            maximo = Math.max(maximo, tope.val);

            pila.push(tope.derecha);
            pila.push(tope.izquierda);
        }

        return maximo;
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
