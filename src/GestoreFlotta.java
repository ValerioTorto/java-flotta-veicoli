import java.util.ArrayList;
import java.util.Random;

public class GestoreFlotta {
    public static void main(String[] args) {
        ArrayList<Veicoli>veicoli = new ArrayList<>();
        Random randoms = new Random();
        int veicoliTotali = randoms.nextInt(5,10);

        for (int i = 0; i <veicoliTotali; i++){
            int plateNumber = randoms.nextInt(10000, 99999);
            int matriNumber = randoms.nextInt(1990,2023);
            System.out.println("Numero di targa: " + plateNumber + " Anno di immatricolazione: " + matriNumber);

        }
    }
}
