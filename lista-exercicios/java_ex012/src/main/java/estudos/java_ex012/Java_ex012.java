package estudos.java_ex012;

import java.util.Scanner;

public class Java_ex012 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //var
        float preco, desconto, promo;
        //entrada
        System.out.println("~ Calculo de desconto -------------------------------");
        System.out.print("Valor do produto: R$");
        preco = teclado.nextFloat();
        //processamento
        desconto = preco*5/100;
        promo = preco - desconto;
        //saída
        System.out.println("~ Resultado -----------------------------------------");
        System.out.println("O valor do desconto, de 5%: R$" + desconto);
        System.out.print("Valor com o desconto R$" + promo);
    }
}
