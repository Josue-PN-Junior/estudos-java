package estudos.aula39;

import java.util.Scanner;

public class Aula39 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float preco, desconto;
        System.out.print("Preço do produto: R$");
        preco = teclado.nextFloat();
        desconto = preco - (preco*20/100);
        System.out.println("Valor com desconto R$" + desconto);
    }
}
