package latihan1;

public class Main {
    public static void main(String[] args) {
        // Contoh Polymorphism dengan Kelas Abstrak
        System.out.println("--- Contoh Polymorphism dengan Kelas Abstrak ---");
        // Referensi Bentuk menunjuk ke objek Lingkaran
        Bentuk lingkaran = new Lingkaran(5);
        System.out.println("Luas Lingkaran: " + lingkaran.hitungLuas()); // Memanggil metode Lingkaran
        lingkaran.tampilkanPesan(); // Memanggil metode Bentuk

        // Referensi Bentuk menunjuk ke objek PersegiPanjang
        Bentuk persegiPanjang = new PersegiPanjang(4, 6);
        System.out.println("Luas Persegi Panjang: " + persegiPanjang.hitungLuas()); // Memanggil metode PersegiPanjang
        persegiPanjang.tampilkanPesan(); // Memanggil metode Bentuk

        // Array of Bentuk
        Bentuk[] daftarBentuk = new Bentuk[2];
        daftarBentuk[0] = new Lingkaran(7);
        daftarBentuk[1] = new PersegiPanjang(8, 3);

        for (Bentuk b : daftarBentuk) {
            System.out.println("Luas dari " + b.getClass().getSimpleName() + ": " + b.hitungLuas());
        }
    }
}