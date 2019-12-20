import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;

/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 18/12/2019
 */

public class Person {

    // TODO Ret nedenstående datatyper
    String navn = "Test Testesen";
    int alder = 18;
    String by = "Næstved";
    int postNummer = 4700;
    String vej = "Femøvej";
    String husnummer = "3B";
    String nationalitet = "Dansk";
    String fritidsStringeresser = "Snitning, LOL, strikke";
    ArrayList smarthomeDevices = new ArrayList(Collections.singleton("Xbox, 3 Smartlamper, Køleskab m.m."));
    double hojde =  1.56; //meters
    int vaegt = 76; //kg
    double karaktergennemsnit = 5.33;
     ArrayList eksamensKarakterer = new ArrayList(6);
    Date opdateretDato; /* new Date(Sun, Jan, 08 00:00:00 CET 1978) prøvede at få date funktionen til at virke, men
     det løkkes ikke*/
    // TODO Vis eksempler på typecasting
    @Override
    public String toString() {
        return "Navn: " + navn + "By" + by;
    }

    public static void main(String[] args) {

        Person person = new Person();
        person.navn = "Test Testesen";
        person.alder = 18;
        person.by = "Næstved";
        person.postNummer = 4700;
        person.husnummer = "3B";
        person.vej = "Femøvej";
        person.nationalitet = "Dansk";
        person.fritidsStringeresser = "Snitning, LOL, strikke";
        person.hojde = 1.56;
        person.vaegt = 76;
        person.karaktergennemsnit = 5.33;


    }

}
