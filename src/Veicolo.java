public abstract class Veicolo {

    //Attributi
    private String plateNumber;
    private int matriYear;

    //Costruttori
    public Veicolo(String plateNumber, int matriYear) {
        this.plateNumber = plateNumber;
        this.matriYear = matriYear;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public int getMatriYear() {
        return matriYear;
    }

    public void setMatriYear(int matriYear) {
        this.matriYear = matriYear;
    }


}
