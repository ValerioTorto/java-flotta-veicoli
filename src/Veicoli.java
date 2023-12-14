public abstract class Veicoli {

    //Attributi
    private int plateNumber;
    private int matriNumber;

    //Costruttori
    public Veicoli(int plateNumber, int matriNumber) {
        this.plateNumber = plateNumber;
        this.matriNumber = matriNumber;
    }

    public int getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(int plateNumber) {
        this.plateNumber = plateNumber;
    }

    public int getMatriNumber() {
        return matriNumber;
    }

    public void setMatriNumber(int matriNumber) {
        this.matriNumber = matriNumber;
    }


}
