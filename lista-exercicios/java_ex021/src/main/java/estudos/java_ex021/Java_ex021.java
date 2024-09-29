package estudos.java_ex021;

import java.util.Scanner;

public class Java_ex021 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("~ Ano bissexto? -------------------------------------");
        //entrada
        System.out.print("Infome um ano: ");
        int ano = teclado.nextInt();
        //saída
        System.out.println("~ Resultado ------------------------------------------");
        //teste 
        if (ano%4==0) {
            if (ano%100==0) {
                if (ano%400!=0) {
                    System.out.print("O ano não é bissexto! Nem todos são!");
                } else {
                    System.out.print("O ano é bissexto!");
                }
            } else {
                System.out.print("O ano é bissexto!");
            }
        } else {
            System.out.print("O ano não é bissexto!");
        }
    }
}
