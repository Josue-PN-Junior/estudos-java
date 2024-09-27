package estudos.java_ex007;

import java.util.Scanner;

public class Java_ex007 {

    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);
       //var
       float num, dobro, terc;
       //entrada
        System.out.println("~ Dobro e Terça parte --------------");
        System.out.print("Digite um número: ");
        num = teclado.nextFloat();
        //processamento
        dobro = num * 2;
        terc = num / 3;
        //saída
        System.out.println("~ Resultado -----------------");
        System.out.println("O dobro de " + num + " é " + dobro);
        System.out.println("A terça parte de " + num + " é " + terc);
    
    }
}
