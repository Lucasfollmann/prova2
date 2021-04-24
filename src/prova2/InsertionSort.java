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
public class InsertionSort {

    int h, j;
    int aux;
    int contador = 1;

    public void algoritmoInsertionSort(int vetor[]) {

        //Vai armazenar uma variavel para fazer as comparaçãoes a partir dela.
        for (h = 1; h < vetor.length; h++) {
            //A variavel aux recebe o elemento da segunda posição.
            aux = vetor[h];
            //Inicia a comparação
            j = h - 1;
            //Pega todos os elementos anteriores a aux os menores que ele.
            //Enquanto algum elemento anterior (determinado pela variavel j) se for maior que o valor armazenada em aux.
            while ((j >= 0) && vetor[j] > aux) {
                
                //O elemento seguinte recebe o elemento atual da variavel j.
                vetor[j + 1] = vetor[j];
                j = j - 1;
            }
            vetor[j + 1] = aux;
        }

        if (contador == 1) {
            System.out.println("Insertion Sort");
            contador++;
        }
        System.out.print("[");
        for (h = 0; h < vetor.length; ++h) {
            System.out.print(" " + vetor[h] + " ");
        }
        System.out.println("]; ");
    }

    public static void main(String[] args) {

        InsertionSort execute = new InsertionSort();

        int vetor1[] = {5, 7, 4, 2, 1};
        int vetor2[] = {9, 5, 1, 3, 7};

        execute.algoritmoInsertionSort(vetor1); //Esperado -> [1, 2, 4, 5, 7]
        execute.algoritmoInsertionSort(vetor2); //Esperado -> [1, 3, 5, 7, 9] 
    }
}
