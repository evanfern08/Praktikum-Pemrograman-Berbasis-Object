public class KaryawanKontrak extends Karyawan {
    private String tanggalBerakhirKontrak;

    // Constructor tanpa parameter 
    public KaryawanKontrak() {
        super();
        this.tanggalBerakhirKontrak = "-";
    }

    // Constructor berparameter 
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

    public void cekMasaKontrak() {
        System.out.println("Kontrak " + getNama() + " berakhir pada: " + tanggalBerakhirKontrak);
    }
}