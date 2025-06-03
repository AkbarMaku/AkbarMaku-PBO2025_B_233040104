package latihan2;

// Kelas yang mengimplementasikan interface (Spesialisasi)
class Mobil implements DapatBergerak {
    @Override
    public void bergerak() {
        System.out.println("Mobil bergerak di jalan.");
    }
}