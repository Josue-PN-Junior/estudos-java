package estudos.java_ex015;

import java.util.Scanner;

public class Java_ex015 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //var
        float sal;
        int dias;
        //entrada
        System.out.println("~ Calculo de salário --------------------------------");
        System.out.print("Dias trabalhados: ");
        dias = teclado.nextInt();
        //processamento
        sal = (dias * 8) * 25;
        //saída
        System.out.println("~ Resultado -----------------------------------------");
        System.out.print("Valor a receber R$" + sal);
    }
}
