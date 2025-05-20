package praktek3.tugas;

public abstract class Kendaraan {
    protected String nama;

    public Kendaraan(String nama) {
        this.nama = nama;
    }

    public abstract void nyalakan();

    public String getNama() {
        return nama;
    }
}
