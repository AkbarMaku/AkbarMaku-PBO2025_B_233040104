public class TranskripNilaiMain {
    public static void main(String[] args) {
        // Mahasiswa
        Mahasiswa mhs = new Mahasiswa("210001", "Budi");

        // Matakuliah
        Matakuliah mk1 = new Matakuliah("IF101", "Pemrograman Dasar", "A");
        Matakuliah mk2 = new Matakuliah("IF102", "Struktur Data", "B+");

        // KHS
        KartuHasilStudi khs = new KartuHasilStudi();
        khs.tambahMatakuliah(mk1);
        khs.tambahMatakuliah(mk2);

        // Transkrip Nilai
        TranskripNilai transkrip = new TranskripNilai(mhs, khs);
        transkrip.tampilkanTranskrip();
    }
}
