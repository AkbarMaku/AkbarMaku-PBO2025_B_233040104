package praktek3.tugas;

public class TransportasiMain {
    public static void main(String[] args) {
        SepedaMotor motor = new SepedaMotor("Honda Supra");

        motor.nyalakan();
        motor.belok("kiri");

        // SepedaMotor motor2 = new SepedaMotor("Hayabusa");

        // motor2.nyalakan();
        // motor2.belok("kanan");
    }

}
