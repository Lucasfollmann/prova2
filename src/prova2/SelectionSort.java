/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prova2;

/**
 *
 * @author lucas
 */
public class SelectionSort {
    int u, n, t;
    int aux;
    int contador = 1;

    public void algoritmoSelectionSort(int vetor[]) {

        for (u = 0; u < vetor.length - 1; u++) {
            /*Considera-se como o valor no indice atual do lool,
            o valor inserido no indice que o loop esta.*/
            aux = u;
            //O "for" é para a comparação. Ele irá utilizar o elemento seguinte ao atualdefinido pela variavel.
            for (n = aux + 1; n < vetor.length; n++) {
                if (vetor[n] < vetor[aux]) {
                    aux = n;
                }
            }
            //Aqui realiza a troca dos elementos.
            if (aux != u) {
                t = vetor[u];
                vetor[u] = vetor[aux];
                vetor[aux] = t;
            }
        }

        if (contador == 1) {
            System.out.println("Selection Sort");
            contador++;
        }
        System.out.print("[");
        for (u = 0; u < vetor.length; ++u) {
            System.out.print(" " + vetor[u] + " ");
        }
        System.out.println("]; ");

    }

    public static void main(String[] args) {

        SelectionSort execute = new SelectionSort();

        int vetor1[] = {3, 7, 1, 8, 2, 6};
        int vetor2[] = {4, 5, 6, 3, 1, 8};

        execute.algoritmoSelectionSort(vetor1); //Esperado -> [1, 2, 3, 6, 7, 8]
        execute.algoritmoSelectionSort(vetor2); //Esperado -> [1, 3, 4, 5, 6, 8]   
    }
}

