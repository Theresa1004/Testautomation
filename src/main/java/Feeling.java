import java.util.Scanner;


    public class Feeling{
        public static void main (String [] args){
            //neuer Datentyp
            Scanner Eingaben = new Scanner(System.in);


            System.out.println("Hallo Du, wie ist dein Name?");
            String Name = Eingaben.nextLine();


            System.out.println("Wie geht es dir heute?");
            String Feeling = Eingaben.nextLine();


            System.out.println("Mein Name ist: " + Name + " mir geht es heute " + Feeling);


        }
    }

