import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 13/12/2019
 */

public class Quickmaths {
    public static void main(String[] args) {
        //en lommeregner metoder hvor man indtaster to numre hvor den så returnere summen og gennemsnittet.
        Scanner input = new Scanner(System.in);
        float gennemsnit;
        System.out.println("Skriv det første nummer: ");
        int a = input.nextInt();
        System.out.println("Skriv det sidste nummer: ");
        int b = input.nextInt();
        int sum = a + b;
        System.out.println("resultat: " +sum);
        gennemsnit = (float)((a+b)/2);
        System.out.println("gennemsnit: " +gennemsnit);

    }
}
