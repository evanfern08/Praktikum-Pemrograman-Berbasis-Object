public class KaryawanDemo {
    public static void main(String[] args) {
        // ===== Bagian 1: constructor overloading di Karyawan =====
        Karyawan kosong = new Karyawan();              // overload 1: tanpa parameter
        Karyawan isi = new Karyawan("K999", "Admin Sistem", "Staff Umum"); // overload 2: berparameter

        System.out.println("Karyawan (constructor tanpa parameter):");
        kosong.tampilkanData();
        System.out.println("=========================");
        System.out.println("Karyawan (constructor berparameter):");
        isi.tampilkanData();

        System.out.println("=========================");

        // ===== Bagian 2: overriding absen() pada child class =====
        KaryawanTetap tetap = new KaryawanTetap("K001", "Budi Santoso", "Manajer", 5000000);
        tetap.tampilkanData();
        tetap.absen();                  // override milik KaryawanTetap -> "fingerprint kantor"
        tetap.absen("Dinas luar kota"); // overload absen(String), diwariskan dari Karyawan (tidak di-override)
        tetap.hitungGajiTahunan(10000000);

        System.out.println("=========================");

        KaryawanKontrak kontrak = new KaryawanKontrak("K002", "Siti Aminah", "Staff IT", "2026-12-31");
        kontrak.tampilkanData();
        kontrak.absen();                  // override milik KaryawanKontrak -> "aplikasi mobile"
        kontrak.absen("Work from home");  // overload absen(String), tetap diwariskan dari Karyawan
        kontrak.cekMasaKontrak();

        System.out.println("=========================");

        // ===== Bagian 3: modifikasi atribut (nama & jabatan masih bisa, nip TIDAK BISA lagi) =====
        System.out.println("Memodifikasi data tetap...");
        tetap.setNama("Dewi Lestari");
        tetap.setJabatan("Supervisor");
        tetap.setTunjanganPensiun(3000000);
        // tetap.setNip("K003");  <-- SENGAJA DIKOMENTARI: tidak bisa dipanggil lagi,
        //                            karena setNip() sudah dihapus dan nip bersifat final

        System.out.println("Data tetap setelah dimodifikasi (NIP tetap sama sejak awal dibuat):");
        tetap.tampilkanData();
        tetap.hitungGajiTahunan(8000000);
    }
}