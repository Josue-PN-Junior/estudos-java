package estudos.java_ex003;

import java.util.Scanner;

public class Java_ex003 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String funcionario;
        float salario;
        System.out.print("Nome funcionário(a): ");
        funcionario = teclado.next();
        System.out.print("Salário: R$");
        salario = teclado.nextFloat();
        //saída
        System.out.print("O funcionário(a) " + funcionario + " tem um salário de R$" + salario + " em Setembro.");
    }
}
