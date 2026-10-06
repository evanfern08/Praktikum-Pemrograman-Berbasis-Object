public class KaryawanKontrak extends Karyawan {
    private String tanggalBerakhirKontrak;

    public KaryawanKontrak(String nip, String nama, String jabatan, String tanggalBerakhirKontrak) {
        super(nip, nama, jabatan);
        this.tanggalBerakhirKontrak = tanggalBerakhirKontrak;
    }

    public String getTanggalBerakhirKontrak() {
        return tanggalBerakhirKontrak;
    }

    public void setTanggalBerakhirKontrak(String tanggalBerakhirKontrak) {
        this.tanggalBerakhirKontrak = tanggalBerakhirKontrak;
    }

    // Override: menimpa absen() milik Karyawan dengan perilaku khusus KaryawanKontrak
    @Override
    public void absen() {
        System.out.println(getNama() + " (" + getNip() + ") absen via aplikasi mobile.");
    }

    public void cekMasaKontrak() {
        System.out.println("Kontrak " + getNama() + " berakhir pada: " + tanggalBerakhirKontrak);
    }
}