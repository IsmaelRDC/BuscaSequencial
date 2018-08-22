/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bubllesort;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author Roberta
 */
public class buscasequencial {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        Random alt = new Random();
        int vetor[] =new int[40];
        boolean variav = false;
        for (int i = 0; i <vetor.length; i++) {
            vetor[i] = alt.nextInt(100);
        }
        System.out.println("Diga os numeros que quer:");
        int valor = tec.nextInt();
        for (int i = 0; i <vetor.length; i++) {
            if(valor == vetor[i]){
                System.out.println("O numero foi encontrado");
                System.out.println("o numero encontrado é"+ valor);
                variav = true;
                break;
            }
        }
        if (variav == false) {
            System.out.println("O numero não foi encontrado");
        }
    }
}
