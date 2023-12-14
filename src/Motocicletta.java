public class Motocicletta extends Veicolo {
    private String cavalletto;
    public Motocicletta(String plateNumber, int matriYear, String cavalletto) {
        super(plateNumber, matriYear);
        this.cavalletto = cavalletto;
    }

    public String getCavalletto() {
        return cavalletto;
    }

    public void setCavalletto(String cavalletto) {
        this.cavalletto = cavalletto;
    }
}
