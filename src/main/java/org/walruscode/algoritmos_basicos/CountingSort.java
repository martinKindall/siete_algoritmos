package org.walruscode.algoritmos_basicos;

public class CountingSort {

    // tiempo: O(n)
    // espacio: O(1)

    // condicion
    // 0 <= arreglo[i] <= 1000
    private static void ordenar(int[] arreglo) {
        if (arreglo.length <= 1) return;

        int[] contador = new int[1001];

        for (int num: arreglo) {
            contador[num]++;
        }

        int idx = 0;
        for (int i = 0; i < contador.length; i++) {
            while (contador[i] > 0) {
                arreglo[idx] = i;
                idx++;
                contador[i]--;
            }
        }
    }

    public static void main(String[] args) {
        int[] ej1 = new int[]{705, 2, 300, 5, 4, 500, 1000, 203, 0, 35, 604, 301, 302, 309, 412, 96, 10, 304, 514, 600};

        ordenar(ej1);

        for (int num: ej1) System.out.println(num);
    }
}
