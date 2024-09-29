package estudos.java_ex019;

import java.util.Scanner;

public class Java_ex019 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("~ Média e resultado ---------------------------------");
        System.out.print("Nome do(a) aluno(a): ");
        String nome = teclado.next();
        float nota1, nota2;
        System.out.print("1º Nota: ");
        nota1 = teclado.nextFloat();
        System.out.print("2º Nota: ");
        nota2 = teclado.nextFloat();
        //média
        float media = (nota1+nota2)/2;
        //saída
        System.out.println("~ Resultado -----------------------------------------");
        System.out.println("A média do(a) " + nome + " foi: " + media);
        //condições
        if (media >= 7) {
            System.out.println("Obteve um bom aproveitamento!");
        } else {
            System.out.println("Teve um baixo aproveitamento!");
        }
    }
}
