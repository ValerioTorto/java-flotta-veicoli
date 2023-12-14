import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
       Automobile auto = new Automobile("FH081GC", 2001,3);
       Automobile auto1 = new Automobile("GH999HJ", 2005, 5);
       Automobile auto2 = new Automobile("JK789LO", 2015, 5);


       Motocicletta moto = new Motocicletta("YH678KO", 2014, "Con cavalletto");
       Motocicletta moto1 = new Motocicletta("IU765TY", 2020, "Senza cavalletto");
       Motocicletta moto2 = new Motocicletta("MH897NB", 2011, "Con cavalletto");

        GestoreFlotta gestore = new GestoreFlotta();
        gestore.newVeicolo(auto);
        gestore.newVeicolo(auto1);
        gestore.newVeicolo(auto2);
        gestore.newVeicolo(moto);
        gestore.newVeicolo(moto1);
        gestore.newVeicolo(moto2);
        System.out.println(gestore.toString());
        }


        // new Automobile("FH081GC",2001,3);

       // Random randoms = new Random();
        /*int veicoliTotali = randoms.nextInt(5,10);

        for (int i = 0; i <veicoliTotali; i++){
            int plateNumber = randoms.nextInt(10000, 99999);
            int matriNumber = randoms.nextInt(1990,2023);
            System.out.println("Numero di targa: " + plateNumber + " Anno di immatricolazione: " + matriNumber);
*/
        }


