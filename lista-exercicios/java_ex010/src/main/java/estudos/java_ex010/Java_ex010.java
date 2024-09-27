package estudos.java_ex010;

import java.util.Scanner;

public class Java_ex010 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //var
        float larg, altu, area, lt_tinta;
        //entrada
        System.out.println("~ Calculador de tinta por metro quadrado ------------");
        System.out.print("Largura da parede: ");
        larg = teclado.nextFloat();
        System.out.print("Altura da parede: ");
        altu = teclado.nextFloat();
        //processamento
        area = larg * altu;
        lt_tinta = area / 2; //1 litro de tinta por 2 metros quadrados
        //saída
        System.out.println("~ Resultado -----------------------------------------");
        System.out.println("A parede tem " + area + "m²(metros quadrados).");
        System.out.print("Será necessário "+ lt_tinta + "Lt(litros) de tinta para pinta-lá!");
    }
}
