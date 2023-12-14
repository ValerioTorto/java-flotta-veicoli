public class Automobile extends Veicolo {

    private int doors;
    public Automobile(String plateNumber, int matriYear, int doors) {
        super(plateNumber, matriYear);
        this.doors = doors;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }
}
