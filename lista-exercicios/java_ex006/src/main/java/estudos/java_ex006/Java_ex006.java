package estudos.java_ex006;

import java.util.Scanner;

public class Java_ex006 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //var
        int num, num_ant, num_pro;
        //entrada
        System.out.println("~ Antecessor e Sucessor ------------------- ");
        System.out.print("Digite um número: ");
        num = teclado.nextInt();
        //processamento
        num_ant = num - 1;
        num_pro = num + 1;
        //saída
        System.out.println("~ Resultado ---------------------------------");
        System.out.println("O antecessor de " + num + " é " + num_ant);
        System.out.print("O sucessor de " + num + " é " + num_pro);
        
    }
}
