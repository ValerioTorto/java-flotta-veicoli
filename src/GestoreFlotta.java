import java.util.ArrayList;
import java.util.Random;

public class GestoreFlotta {
    ArrayList<Veicolo> veicoli = new ArrayList<>();


    public ArrayList<Veicolo> getVeicoli(){
        return veicoli;
    }


    public void newVeicolo(Veicolo veicolo) {
        veicoli.add(veicolo);



    }
}

