package estudos.java_ex17;

import java.util.Scanner;

public class Java_ex17 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //var
        float velocidade;
        //entrada
        System.out.println("~ Multa por execesso de velocidade ----------------------");
        System.out.print("Velocidade registrada: ");
        velocidade = teclado.nextFloat();
        //calculo de multa e condição
        System.out.println("~ Resultado -----------------------------------------");
        //se velocidade acima
        if (velocidade > 80) {
            float multa = (velocidade - 80)*5;
            System.out.print("Você foi multado! ");
            System.out.println("Valor da multa R$"+multa);
        }
        //senão
        System.out.println("Dentro do limite de velocidade!");
    }
}
