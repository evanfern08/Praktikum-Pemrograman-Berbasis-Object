public class Main {
    public static void main(String[] args) {
        // Karyawan k = new Karyawan("Budi", "001"); 

        Karyawan k1 = new KaryawanTetap("Budi Santoso", "T001", 5000000, 1500000);
        Karyawan k2 = new KaryawanKontrak("Siti Aminah", "K001", 150000, 20);

        System.out.println("=== Data Karyawan Tetap ===");
        k1.cetakInfo();

        System.out.println("\n=== Data Karyawan Kontrak ===");
        k2.cetakInfo();
    }
}
