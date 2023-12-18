import java.util.Scanner;

public class Summe {
    public static void main (String [] args){
        //neuer Datentyp
        Scanner Eingaben = new Scanner(System.in);
        System.out.println("Gib die erste Zahl ein");
        //von Konsole eingelesen und Zahl1 vergeben
        int Zahl1 = Eingaben.nextInt();

        //Zahl2
        System.out.println("Gib bitte die zweite Zahl ein");
        int Zahl2 = Eingaben.nextInt();

        int Summe = Zahl1 + Zahl2;

        System.out.println("Die Summe der beiden Zahlen ist: "+ Summe);

    }
}
