import java.util.ArrayList;

public class KartuHasilStudi {
    private ArrayList<Matakuliah> daftarMatakuliah;

    public KartuHasilStudi() {
        daftarMatakuliah = new ArrayList<>();
    }

    public void tambahMatakuliah(Matakuliah matkul) {
        daftarMatakuliah.add(matkul);
    }

    public void tampilkanKHS() {
        for (Matakuliah mk : daftarMatakuliah) {
            System.out.println(mk.getInfo());
        }
    }

    public ArrayList<Matakuliah> getDaftarMatakuliah() {
        return daftarMatakuliah;
    }
}
