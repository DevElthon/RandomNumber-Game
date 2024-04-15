package Exercicios;

import java.util.Scanner;

/**
 * ex2
 */
public class ex2 {

    public static void main(String[] args) {
        int n = 0;
        int limite_tabuada = 10;
        int cont = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("Insira um numero: ");
        n = input.nextInt();

        while(cont <= limite_tabuada){
            System.out.printf("%2d x %2d = %2d\n",n,cont,n * cont);
            cont++;
        }

        input.close();
    }
}