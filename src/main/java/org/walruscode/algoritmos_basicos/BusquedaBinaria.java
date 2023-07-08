package org.walruscode.algoritmos_basicos;

public class BusquedaBinaria {

    // tiempo: O(log(n))
    // espacio: O(1)
    private static int buscar(int numero, int[] arreglo) {
        if (arreglo == null || arreglo.length == 0) return -1;

        int inicio = 0;
        int fin = arreglo.length - 1;
        int medio = (inicio + fin) / 2;

        while (medio >= inicio && medio <= fin) {

            if (numero == arreglo[medio]) {
                return medio;
            } else if (numero > arreglo[medio]) {
                inicio = medio + 1;
            } else if (numero < arreglo[medio]) {
                fin = medio - 1;
            }

            medio = (inicio + fin) / 2;
        }

        return -1;
    }

    public static void main(String[] args) {
        // 20 elementos
        int[] ej1 = new int[]{0, 2, 4, 5, 10, 35, 96, 203, 300, 301, 302, 304, 309, 412, 514, 604, 500, 600, 705, 1000};

        System.out.println(buscar(412, ej1));
    }
}
