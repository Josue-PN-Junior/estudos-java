package estudos.aula40;

import java.util.Calendar;
import java.util.Scanner;

public class Aula40 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Calendar cal = Calendar.getInstance();
        int ano;
        System.out.print("Em qual ano você nasceu? ");
        ano = teclado.nextInt();
        int atual = cal.get(Calendar.YEAR);
        int idade = atual - ano;
        System.out.print("Você tem " + idade + " anos");
    }
}
