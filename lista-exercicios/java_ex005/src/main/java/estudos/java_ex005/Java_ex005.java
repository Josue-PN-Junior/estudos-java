package estudos.java_ex005;

import java.util.Scanner;

public class Java_ex005 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //var
        float n1, n2, media;
        //entrada
        System.out.println("~ Média -------------------");
        System.out.print("Nota 1: ");
        n1 = teclado.nextInt(); 
        System.out.print("Nota 2: ");
        n2 = teclado.nextInt();
        //processamento
        media = (n1 + n2) / 2;
        //saída
        System.out.println("A média do aluno é: " + media);
    }
}
