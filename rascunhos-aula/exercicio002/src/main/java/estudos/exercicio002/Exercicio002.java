package estudos.exercicio002;

import java.util.Scanner;
//foi importado

public class Exercicio002 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nome;
        System.out.print("Qual é o seu nome? ");
        nome = teclado.next();
        System.out.println("Bem-vindo, " + nome + "!");
    }
}
