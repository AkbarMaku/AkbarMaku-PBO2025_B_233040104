public class TranskripNilai {
    private Mahasiswa mahasiswa;               // Asosiasi
    private KartuHasilStudi kartuHasilStudi;   // Agregasi
    private double ipk;

    public TranskripNilai(Mahasiswa mahasiswa, KartuHasilStudi khs) {
        this.mahasiswa = mahasiswa;
        this.kartuHasilStudi = khs;
        this.ipk = 0.0;
    }

    public void tampilkanTranskrip() {
        System.out.println("=== TRANSKRIP NILAI ===");
        System.out.println(mahasiswa.getInfo());
        kartuHasilStudi.tampilkanKHS();
        System.out.println("IPK: " + ipk);
    }
}
