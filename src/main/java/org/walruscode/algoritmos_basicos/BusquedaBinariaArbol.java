package org.walruscode.algoritmos_basicos;

import org.walruscode.algoritmos_basicos.estructuras.Arbol;

public class BusquedaBinariaArbol {

    // árbol balanceado y ordenado
    // tiempo: O(log(n))
    // espacio: O(log(n))
    private static Arbol buscar(int numero, Arbol raiz) {
        if (raiz == null) return null;

        if (numero == raiz.val) return raiz;

        if (numero < raiz.val)
            return buscar(numero, raiz.izquierda);

        return buscar(numero, raiz.derecha);
    }

    public static void main(String[] args) {
        /*
                                8
                              /   \
                             3     13
                            / \    / \
                           1   6  10  14
                              / \
                             4   7
         */

        Arbol ej1 = new Arbol(8,
                new Arbol(3,
                        new Arbol(1),
                        new Arbol(6, new
                                Arbol(4),
                                new Arbol(7))),
                new Arbol(13,
                        new Arbol(10),
                        new Arbol(14)));

        Arbol resultado = buscar(1, ej1);

        if (resultado != null) System.out.println(resultado.val);
        else                   System.out.println("No encontrado");
    }
}
