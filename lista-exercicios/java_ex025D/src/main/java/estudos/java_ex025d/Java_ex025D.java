package estudos.java_ex025d;

import java.util.Scanner;

public class Java_ex025D {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("~ É triangulo ? -------------------------------------");
        int reta1, reta2, reta3;
        System.out.print("Temanho reta 1: ");
        reta1 =  teclado.nextInt();
        System.out.print("Tamanho reta 2: ");
        reta2 = teclado.nextInt();
        System.out.print("Tamanho reta 3: ");
        reta3 = teclado.nextInt();
        //processamento e saída
        System.out.println("~ Resultado -----------------------------------------");
        if ((reta1 + reta2 > reta3) && (reta2 + reta3 > reta1) && (reta1 + reta3 > reta2)) {
            System.out.println("É possível formar um triângulo!");
        } else {
            System.out.println("NÃO é possível formar um triângulo!");
        }
        
    }
}
