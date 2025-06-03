package pertemuan14.tugas4;

public class DatabaseConnection {
    public static String connectionString;

    // Static block untuk inisialisasi connectionString
    static {
        connectionString = "jdbc:mysql://localhost:3306/mydatabase";
        System.out.println("Static block executed: Database connection initialized.");
    }
}
