package praktek3.tugas;

public class TransportasiMain {
    public static void main(String[] args) {
        SepedaMotor motor = new SepedaMotor("Honda Supra");

        motor.nyalakan();
        motor.belok("kiri");
    }
}
