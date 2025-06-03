package pertemuan14.tugas3;

public class Counter {
    private static int instanceCount = 0; // variabel static untuk menghitung jumlah objek

    // Constructor
    public Counter() {
        instanceCount++; // meningkat setiap kali objek dibuat
    }

    // Method static untuk mendapatkan jumlah instance
    public static int getInstanceCount() {
        return instanceCount;
    }
}
