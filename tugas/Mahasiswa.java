public class Mahasiswa {
    private String nim;
    private String nama;

    public Mahasiswa(String nim, String nama) {
        this.nim = nim;
        this.nama = nama;
    }

    public String getInfo() {
        return "NIM: " + nim + ", Nama: " + nama;
    }
}
