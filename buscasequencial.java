
package ativJava;
import java.util.Scanner;
import java.util.Random;

public class buscaSequencial {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        Random aleatorio = new Random();
        int vetor[] =new int[40];
        boolean variavel =true;
        for (int i = 0; i <vetor.length; i++) {
            vetor[i] = aleatorio.nextInt(100);
        }
        
        System.out.println("Digite os numeros desejados:");
        int valor = tcl.nextInt();
        for (int i = 0; i <vetor.length; i++) {
            if(valor == vetor[i]){
                System.out.println("O numero que foi encontrado é"+ valor);
                variavel = false;
                break;
            }
        }
        
        if (variavel == true) {
            System.out.println("O numero digitado não foi encontrado :( ");
        }
    }
}
