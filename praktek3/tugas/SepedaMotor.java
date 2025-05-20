package praktek3.tugas;

public class SepedaMotor extends Kendaraan implements BisaBermanuver {

    public SepedaMotor(String nama) {
        super(nama);
    }

    @Override
    public void nyalakan() {
        System.out.println(nama + " dinyalakan.");
    }

    @Override
    public void belok(String arah) {
        System.out.println(nama + " berbelok ke " + arah + ".");
    }
}
