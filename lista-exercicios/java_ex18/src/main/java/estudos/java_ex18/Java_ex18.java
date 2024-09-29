package estudos.java_ex18;

import java.util.Calendar;
import java.util.Scanner;

public class Java_ex18 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Calendar cad = Calendar.getInstance();
        System.out.println("~ Pode votar ou não ---------------------------------");
        //entrada de idade
        System.out.print("Ano de nascimento: ");
        int nasc = teclado.nextInt();
        //ano atual
        int ano = cad.get(Calendar.YEAR);
        //processamento
        int idade = ano - nasc;
        //condição
        System.out.println("~ Resultado -----------------------------------------");
        if (idade >= 18) {
            System.out.print("Você já pode votar!");
        } else if(idade >=16){
            System.out.print("Você pode votar!");
        } else {
            System.out.print("Você não pode votar!");
        }
    }
}
