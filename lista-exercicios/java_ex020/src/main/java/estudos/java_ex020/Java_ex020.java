package estudos.java_ex020;

import java.util.Scanner;

public class Java_ex020 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("~ PAR ou IMPAR --------------------------------------");
        //entrada
        System.out.print("Digite um número: ");
        int num = teclado.nextInt();
        //saída
        System.out.println("~ Resultado -----------------------------------------");
        //condição
        if (num%2==0) {
            System.out.println("O número " + num + " é PAR!");
        } else {
            System.out.println("O número " + num + " é IMPAR!");
        }
    }
}
