package latihan2;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n--- Contoh Polymorphism dengan Interface ---");
        // Referensi DapatBergerak menunjuk ke objek Mobil
        DapatBergerak kendaraan1 = new Mobil();
        kendaraan1.bergerak(); // Memanggil metode Mobil

        // Referensi DapatBergerak menunjuk ke objek Pesawat
        DapatBergerak kendaraan2 = new Pesawat();
        kendaraan2.bergerak(); // Memanggil metode Pesawat

        // List of DapatBergerak
        java.util.List<DapatBergerak> daftarObjekBergerak = new java.util.ArrayList<>();
        daftarObjekBergerak.add(new Mobil());
        daftarObjekBergerak.add(new Pesawat());

        for (DapatBergerak db : daftarObjekBergerak) {
            db.bergerak(); // Metode bergerak yang berbeda dieksekusi tergantung pada objek
        }
    }
}