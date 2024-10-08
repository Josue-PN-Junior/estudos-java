package estudos.aula43;

import java.util.Random;

public class Aula43 {

    public static void main(String[] args) {
        Random gerador = new Random();
        int n1 = gerador.nextInt(10);
        int n2 = gerador.nextInt(20);
        System.out.println("Os números sorteados foram " + n1 + " e " + n2);
    }
}
