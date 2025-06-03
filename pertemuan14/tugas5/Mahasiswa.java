package pertemuan14.tugas5;

public class Mahasiswa {
    private final String nim;                // NIM bersifat tetap
    private String nama;                     // Nama dapat berubah
    private static int totalMahasiswa = 0;   // Hitung jumlah instance
    public static final int MAX_SKS = 24;    // Konstanta batas maksimum SKS

    // Constructor
    public Mahasiswa(String nim, String nama) {
        this.nim = nim;
        this.nama = nama;
        totalMahasiswa++;  // Tambah setiap kali objek dibuat
    }

    // Getter optional untuk total mahasiswa
    public static int getTotalMahasiswa() {
        return totalMahasiswa;
    }

    // Method untuk menampilkan informasi mahasiswa
    public void displayInfo() {
        System.out.println("NIM        : " + nim);
        System.out.println("Nama       : " + nama);
        System.out.println("Maksimum SKS: " + MAX_SKS);
        System.out.println("---------------------------");
    }
}
