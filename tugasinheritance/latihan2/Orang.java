package tugasinheritance.latihan2;

public class Orang {
    
    protected String nama;
    protected String alamat;

    public Orang() {
        nama = "Akbar Maku";
        alamat = "Bandung";
    }

    public void getNama() {
            return nama;
    }

    public String getAlamat(){
        return alamat;
    }

}
