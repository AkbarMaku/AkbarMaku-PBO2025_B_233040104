public class Matakuliah {
    private String kode;
    private String nama;
    private String nilai;

    public Matakuliah(String kode, String nama, String nilai) {
        this.kode = kode;
        this.nama = nama;
        this.nilai = nilai;
    }

    public String getInfo() {
        return kode + " - " + nama + ", Nilai: " + nilai;
    }
}
