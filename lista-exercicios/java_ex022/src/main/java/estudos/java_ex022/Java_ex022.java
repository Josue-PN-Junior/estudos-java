package estudos.java_ex022;

import java.util.Calendar;
import java.util.Scanner;

public class Java_ex022 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Calendar cad = Calendar.getInstance();
        int ano = cad.get(Calendar.YEAR);
        //início
        System.out.println("~ Alistamento Militar -------------------------------");
        System.out.print("Ano de nascimento: ");
        int ano_nasc = teclado.nextInt();
        //processamento
        int idade = ano - ano_nasc;
        //saída
        System.out.println("~ Resultado -----------------------------------------");
        //ano atual
        System.out.println("* Ano atual " + ano + " !");
        //condição
        if (idade >= 18 && idade <= 19) {
            System.out.println("DEVE se alistar! ");
        } else if (idade >= 20){
            System.out.println("Já se alistou!");
            System.out.println("Alistado há " + (idade-18) + " ano(os)!");
        } else {
            System.out.println("NÃO é precisso se alistar agora!");
            System.out.println("Faltam " + (18-idade) + " ano(os) para se alistar!");
        }
    }
}
