package estudos.java_ex023;

import java.util.Scanner;

public class Java_ex023 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("~ Descontos -----------------------------------------");
        //entradas
        System.out.print("Nome do(a) cliente: ");
        String nome_cli = teclado.next();
        System.out.println("@ opções: Mulher[m]; Homen[h]; e Outro[o].");
        System.out.print("Sexo: ");
        char sexo;
        sexo = (char) teclado.next().charAt(0);
        System.out.print("Valor da compra: R$");
        float valorCompra = teclado.nextFloat();
        //processamento
        float desconto;
        String tipoDesc = "desconto de 5%";
        if (sexo=='m' || sexo=='M') {
             desconto = valorCompra * 13/100;
             tipoDesc = "desconto especial de 13% para mulheres!";
        } else {
            desconto = valorCompra * 5/100;
        }
        //novo valor
        float novo_valor = valorCompra - desconto;
        //saída
        System.out.println("~ Resultado -----------------------------------------");
        System.out.println("Obrigado pela compra "+nome_cli+"!");
        System.out.println("Valor com " + tipoDesc);
        System.out.println("Valor do desconto: R$"+desconto);
        System.out.println("Valor apagar: R$"+ novo_valor);
    }
}
