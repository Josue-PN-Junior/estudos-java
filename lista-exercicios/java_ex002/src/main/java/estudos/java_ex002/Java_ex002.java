package estudos.java_ex002;

import java.util.Scanner;

public class Java_ex002 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nome; 
        System.out.print("Qual é o seu nome? ");
        nome = teclado.next();
        System.out.print("Olá " + nome + ", seja bem-vindo!");
    }
}
