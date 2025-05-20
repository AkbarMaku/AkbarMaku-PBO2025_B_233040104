package praktek3.latihan;

public class KartuElektronik implements Kartu {
    private String id;
    private String pin;

    public KartuElektronik(String id, String pin) {
        this.id = id;
        this.pin = pin;
    }

    @Override
    public boolean otentikasi(String pin) {
        return this.pin.equals(pin);
    }

    @Override
    public String encode(String pin) {
        return new StringBuilder(pin).reverse().toString();
    }
}
