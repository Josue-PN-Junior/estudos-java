package estudos.java_ex009;

import java.util.Scanner;

public class Java_ex009 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //var
        float reais, valor_dol, dolar;
        //entrada
        System.out.println("~ Conversor de Reais para Dolár -----------------------");
        System.out.print("Reais na carteira: R$");
        reais = teclado.nextFloat();
        System.out.print("Valor atual dolar: R$");
        valor_dol = teclado.nextFloat();
        //processamento
        dolar = reais / valor_dol;
        //saída
        System.out.println("~ Resultado -----------------------------------------");
        System.out.print("Você pode comprar US$"+dolar);
    }
}
