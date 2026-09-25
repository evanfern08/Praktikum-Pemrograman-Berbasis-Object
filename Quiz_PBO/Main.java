package Quiz_PBO;

public class Main {
    public static void main(String[] args) {

        Pelanggan pelanggan = new Pelanggan(
            "Budi Santoso",
            "081234567890"
        );

        Karyawan karyawan = new Karyawan(
            "Andi",
            "Mekanik"
        );

        Layanan layanan = new Layanan(
            "Servis Mesin",
            100000,
            karyawan
        );

        Kendaraan mobil1 = new Kendaraan(
            "N 1234 AB",
            "Toyota",
            "Avanza",
            "Mobil",
            pelanggan
        );

        Kendaraan mobil2 = new Kendaraan(
            "N 5678 CD",
            "Honda",
            "Brio",
            "Mobil",
            pelanggan
        );

        Kendaraan motor1 = new Kendaraan(
            "N 1111 EF",
            "Honda",
            "Vario",
            "Sepeda Motor",
            pelanggan
        );

        Kendaraan motor2 = new Kendaraan(
            "N 2222 GH",
            "Yamaha",
            "NMAX",
            "Sepeda Motor",
            pelanggan
        );

        System.out.println("===== BENGKEL MAJU =====");
        System.out.println("Nama Pelanggan    : " + pelanggan.getNama());
        System.out.println("Nomor Telepon     : " + pelanggan.getNomorTelepon());

        System.out.println("\n--- KENDARAAN ---");

        tampilkanKendaraan(mobil1, layanan);
        tampilkanKendaraan(mobil2, layanan);
        tampilkanKendaraan(motor1, layanan);
        tampilkanKendaraan(motor2, layanan);

        System.out.println("\n--- LAYANAN ---");
        System.out.println("Nama Layanan      : " + layanan.getServiceName());
        System.out.println("Harga Dasar       : Rp" + layanan.getServicePrice());
        System.out.println("Karyawan          : " +
                           layanan.getKaryawan().getNamaKaryawan());
        System.out.println("Jabatan           : " +
                           layanan.getKaryawan().getJabatan());
    }

    public static void tampilkanKendaraan(
            Kendaraan kendaraan, Layanan layanan) {

        System.out.println("\nPlat Nomor        : " +
                           kendaraan.getPlatNomor());
        System.out.println("Merek             : " +
                           kendaraan.getMerek());
        System.out.println("Model             : " +
                           kendaraan.getModel());
        System.out.println("Tipe              : " +
                           kendaraan.getTipeKendaraan());

        System.out.println("Total Biaya       : Rp" +
                           kendaraan.hitungBiaya(layanan));
    }
}