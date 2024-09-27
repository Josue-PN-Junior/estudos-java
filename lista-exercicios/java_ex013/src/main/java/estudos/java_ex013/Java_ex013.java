package estudos.java_ex013;

import java.util.Scanner;

public class Java_ex013 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //var
        float sal, aumento, novo_sal;
        //entrada
        System.out.println("~ Aumento de 15% ------------------------------------");
        System.out.print("Salário: R$");
        sal = teclado.nextFloat();
        //processamento
        aumento = sal*15/100;
        novo_sal = sal + aumento;
        //saída
        System.out.println("~ Resultado -----------------------------------------");
        System.out.println("Valor do aumento 15%: R$" + aumento);
        System.out.println("Novo salário: R$" + novo_sal);
    }
}
