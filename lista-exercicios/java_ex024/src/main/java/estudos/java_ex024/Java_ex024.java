package estudos.java_ex024;

import java.util.Scanner;

public class Java_ex024 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("~ Preço da viajem -----------------------------------");
        System.out.print("Distância a ser percorrida(km): ");
        float km = teclado.nextFloat();
        //condição
        float valor_km;
        if (km < 200) {
            valor_km = (float) 0.50;
        } else {
            valor_km = (float) 0.45;
        }
        //calculo de valor
        float valor = valor_km * km;
        //saída
        System.out.println("~ Resultado -----------------------------------------");
        System.out.println("O valor por km: R$"+valor_km);
        System.out.println("Valor a pagar: R$"+valor);
    }
}
