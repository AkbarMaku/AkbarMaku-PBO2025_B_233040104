package praktek3.latihan;

public class Lingkaran extends Bentuk {

    public Lingkaran(int jari2) {
        super(jari2);
    }

    @Override
    public double luas() {
        return PHI * jari2 * jari2;
    }
}

// 1. Sebutkan method abstrak yang terdapat di kelas abstrak Bentuk!
// public abstract double luas();
// 2. Jelaskan apa perbedaannya method luas di kelas Bentuk dan di kelas Lingkaran dan kelas Tabung!
// Di kelas bentuk method luas adalah abstrak tidak memiliki isi atau implementasi, hanya sebagai template untuk kelas turunan.
// Di kelas lingkaran method luas dihitung menggunakan rumus luas lingkaran yaitu, PHI×jari2×jari2
// Di kelas tabung method luas dihitung menggunakan rumus luas permukaan tabung, yaitu, 2×PHI×jari2×(jari2+tinggi)
// 3. Jelaskan bagaimana jika method luas di kelas Tabung dihilangkan atau tidak mengimplementasikannya!
// Jika kelas Tabung tidak mengimplementasikan method luas(), maka akan terjadi error saat kompilasi, kecuali jika Tabung juga dijadikan kelas abstrak. Karena Bentuk mendeklarasikan luas() sebagai method abstrak, semua kelas non-abstrak yang mewarisi Bentuk wajib mengimplementasikan method ini.
// 4. Jawaban no 4 ada di file Main.java
// 