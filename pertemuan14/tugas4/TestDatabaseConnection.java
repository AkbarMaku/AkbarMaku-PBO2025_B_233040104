package pertemuan14.tugas4;

public class TestDatabaseConnection {
    public static void main(String[] args) {
        // Mengakses connectionString untuk memicu static block (jika belum diload)
        System.out.println("Connection String: " + DatabaseConnection.connectionString);
    }
}
