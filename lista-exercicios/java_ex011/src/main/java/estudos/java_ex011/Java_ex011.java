package estudos.java_ex011;

import java.util.Scanner;

public class Java_ex011 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //var
        int a, b, c;
        float delta;
        //entrada
        System.out.println("~ Calculo de Delta ----'------------------------------");
        System.out.print("Digite o valor de "+"\"a\": ");
        a = teclado.nextInt();
        System.out.print("Digite o valor de "+"\"b\": ");
        b = teclado.nextInt();
        System.out.print("Digite o valor de \"c\": ");
        c = teclado.nextInt();
        //processamento
        delta = (b*b - 4 * a * c);
        //saída
        System.out.println("~ Resultado -----------------------------------------");
        System.out.print("Valor de Delta: " + delta);
    }
}
