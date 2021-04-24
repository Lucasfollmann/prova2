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
public class BubbleSort {
int j, p;
    int aux;
    int contador = 1;
   
        //code application logic here
   
    public void algoritmoBubbleSort(int vetor[]) {
        //irá Garantir que o processo vai ser repitido baseado no tamanho no vetor
        for (p = 0; p < vetor.length; ++p) {
             //Responsavel de analizar dois valores
            for (j = 0; j < (vetor.length - 1); ++j) {
                //responsável que  faz a comparação,e é responsável por verificar se um determinado membro é maior que o outro e realizar a inversão caso for necessaria
                if (vetor[j] > vetor[j + 1]) {
                    aux = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = aux;
                }
            }
        }

        if (contador == 1) {
            System.out.println("Bubble Sort");
            contador++;
        };
        System.out.print("[");
        for (p = 0; p < vetor.length; ++p) {
            System.out.print(" " + vetor[p] + " ");
        }
        System.out.println("]; ");

    }

    public static void main(String[] args) {

        BubbleSort execute = new BubbleSort();

        int vetor1[] = {3, 7, 1, 2, 6};
        int vetor2[] = {4, 6, 3, 1, 8};

        execute.algoritmoBubbleSort(vetor1); //Esperado -> [1, 2, 3, 6, 7]
        execute.algoritmoBubbleSort(vetor2); //Esperado -> [1, 3, 4, 6, 8]
    }

}