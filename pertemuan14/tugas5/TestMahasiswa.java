package pertemuan14.tugas5;

public class TestMahasiswa {
    public static void main(String[] args) {
        // Membuat beberapa objek Mahasiswa
        Mahasiswa m1 = new Mahasiswa("233040104", "Akbar Maku");
        Mahasiswa m2 = new Mahasiswa("233040105", "Muhammad Fajri");
        Mahasiswa m3 = new Mahasiswa("233040106", "rina");

        // Menampilkan informasi masing-masing mahasiswa
        m1.displayInfo();
        m2.displayInfo();
        m3.displayInfo();

        // Menampilkan total mahasiswa
        System.out.println("Total Mahasiswa Terdaftar: " + Mahasiswa.getTotalMahasiswa());
    }
}
