package Exercicios;
import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ex1 Ex1 = new ex1();
        int n = 0;

        n = Ex1.Limite(n, input);
        
        while(n < 1 || n > 100){
            System.out.println("Numero invalido!");
            n = Ex1.Limite(n, input);
        }

        input.close();
        Ex1.Contador(n);
    }

    public void Contador(int limite){
        int cont = 1;
        while(cont <= limite){
            System.out.print(cont + " ");
            cont++;
        }
    }

    public int Limite(int n, Scanner input){
        System.out.println("Informe o limite (entre 1 e 100): ");
        return n = input.nextInt();
    }
}