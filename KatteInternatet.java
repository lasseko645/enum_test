import java.util.*;

public class KatteInternatet {
    public static void main(String[] args) {
        System.out.println("Hello internat!");

        Kat kat1; // Deklarer kat1 variablen
        kat1 = new Kat("Garfield"); // Initierer variablen
        kat1.sov();
        kat1.setAlder(3);
        kat1.hvorGammel();

        Kat kat2; // Deklarer kat2 variablen
        kat2 = new Kat("Misser"); // Initierer variablen
        kat2.sov();

        Kat kat3 = new Kat("Pølse"); // Initierer og deklarerer variablen
        kat3.hop();

        // Viser kat1 og kat2s alder
        kat1.hvorGammel();
        kat2.hvorGammel();

        // vi laver lige et nyt objekt for at kunne vise at klassen KatteLejetøj virker
        KatteLegetøj legetøj1 = new KatteLegetøj("plastic", "gul");
        legetøj1.rasle();

        KatteLegetøj legetøj2 = new KatteLegetøj("træ","brun");
        legetøj2.piv();
        legetøj2.setAlter(12);
        legetøj2.getAlter();
        System.out.println("legetøjet er " + legetøj2.alter + " år gammelt. ");

        // Slette kat3
        kat3 = null;

        // En lækker anvendelse af Dato klassen
        Date dato = new Date();
        System.out.println(dato.toString());
        // Her kan du se, hvorn kan man gøre datoen til dansk
        // http://www.linuxbog.dk/java/bog/java-i18n-formatering-dato.html

        // En lækker anvendelse af Random klassen
        Random random1 = new Random(3);
        System.out.print("From random1: ");
        for (int i = 0; i < 10; i++)
            System.out.print(random1.nextInt(1000) + " ");
        Random random2 = new Random(3);
        System.out.print("\nFrom random2: ");
        for (int i = 0; i < 10; i++)
            System.out.print(random2.nextInt(1000) + " ");
        // Her kan du se, hvordan vi kan lave tilfældige numre
        // https://www.tutorialspoint.com/java/lang/math_random.htm


    }
}
