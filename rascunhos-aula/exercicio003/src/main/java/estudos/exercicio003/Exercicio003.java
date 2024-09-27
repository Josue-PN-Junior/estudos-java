package estudos.exercicio003;

import java.util.Scanner;

public class Exercicio003 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int n1, n2, s;
        System.out.print("Digite um valor: ");
        n1 = teclado.nextInt();
        System.out.print("Digite outro valor: ");
        n2 = teclado.nextInt();
        s = n1 + n2;
        System.out.print("A soma de " + n1 + " + " + n2 + " é igual a: " + s);
    }
}
