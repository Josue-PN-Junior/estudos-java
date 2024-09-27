package estudos.java_ex008;

import java.util.Scanner;

public class Java_ex008 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //var
        float metros, km, hm, dam, dm, cm, mm;
        //entrada
        System.out.println("~ Medidas -------------------");
        System.out.print("Digite uma distância em metros: ");
        metros = teclado.nextFloat();
        //processamento
        km = metros / 1000;
        hm = metros / 100;
        dam = metros / 10;
        dm = metros * 10;
        cm = metros * 100;
        mm = metros * 1000;
        //saída
        System.out.println("~ Resultado -------------------------");
        System.out.println("A medida " + metros + "m equivale: ");
        System.out.println(km + "km(Quilômetros)");
        System.out.println(hm + "hm(Hectómetro)");
        System.out.println(dam + "dam(Decâmetro)");
        System.out.println("-------------------------------------");
        System.out.println(dm + "dm(Decímetro)");
        System.out.println(cm + "cm(Centímetro)");
        System.out.println(mm + "mm(Milímetro)");
    }
}
