package estudos.java_ex004;

import java.util.Scanner;

public class Java_ex004 {

    public static void main(String[] args) {
        //scanner
        Scanner teclado = new Scanner(System.in);
        //var
        int n1, n2, soma;
        //entrada
        System.out.print("Digite um valor: ");
        n1 = teclado.nextInt();
        System.out.print("Digite outro valor: ");
        n2 = teclado.nextInt();
        //soma
        soma = n1 + n2;
        //saída
        System.out.print("A soma do números " + n1 + " e " + n2 + " é igual: " + soma );
    }
}
