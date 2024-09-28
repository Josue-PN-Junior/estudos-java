package estudos.java_ex016d;

import java.util.Scanner;

public class Java_ex016D {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //var
        int anos, fumados, perda;
        //entrada
        System.out.println("~ Perda de vida por cigarros ------------------------");
        System.out.print("Quantos cigarros fumados por dias: ");
        fumados = teclado.nextInt();
        System.out.print("Fumante a quantos anos? ");
        anos = teclado.nextInt();
        //processamento
        perda = fumados*10*(365 * anos)/60/24;
        //saída
        System.out.println("~ Resultado -----------------------------------------");
        System.out.print("Em média, você perdeu " + perda + " dias de expectativas de vida.");
    }
}
