package estudos.java_ex014;

import java.util.Scanner;

public class Java_ex014 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //var
        float km, valor;
        int dias;
        //entrada
        System.out.println("~ Aluguel de carros ---------------------------------");
        System.out.print("Quantos quilômetros percorridos: ");
        km = teclado.nextFloat();
        System.out.print("Dias: ");
        dias = teclado.nextInt();
        //processamento
        valor =(float) ((km*0.20) + (dias * 90));
        //     ** precissa converter pra flaot, pois "dias" é int
        //saída
        System.out.println("~ Resultado -----------------------------------------");
        System.out.println("Valor a pagar: R$"+valor);
        
    }
}
