package pertemuan14.tugas1;

public class AppConfig {
    // Konstanta untuk URL base aplikasi
    public static final String BASE_URL = "https://www.myapp.com/api";
    
    // Konstanta untuk versi aplikasi
    public static final String APP_VERSION = "1.0.0";
    
    // Konstanta untuk timeout koneksi default (dalam milidetik)
    public static final int DEFAULT_TIMEOUT = 5000;
    
    // Private constructor untuk mencegah instantiation
    // Karena ini adalah utility class yang hanya berisi konstanta
    // private AppConfig() {
    //     // Mencegah pembuatan instance
    // }
}