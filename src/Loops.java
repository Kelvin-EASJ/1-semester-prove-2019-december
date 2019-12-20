import java.util.Scanner;

/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 17/12/2019
 */

public class Loops {

    private String brugere[] = {"Anders", "Birgit", "Carsten", "Dennis", "Esben"};

    public String[] getBrugere() {
        return brugere;
    }

    public static void main(String[] args) {
        Loops l = new Loops();
        l.printBrugereArr();
        System.out.println("*******");
        l.printBrugereReverseArr();
        System.out.println("*******");
        l.waitingFor0();
    }

    /**
     * Viser en liste med brugere i konsollen
     */
    public void printBrugereArr() {

        // TODO Din kode her

    }

    /**
     * Viser en liste med brugere i konsollen i omvendt rækkefølge
     */
    public void printBrugereReverseArr() {

        // TODO Din kode her

    }

    public void waitingFor0() {

        Scanner input = new Scanner(System.in);

        System.out.println("Indtast et nummer over nul!");
        int number;
        while (input.nextInt() != 0) {
            number = input.nextInt();
            System.out.println("Nummeret er stadig ikke nul! valgte nummer: " + number);
            if (input.nextInt() == 0) {
                System.out.println("Nummeret er nu nul!");
                break;
            }
        }
    }
    }
