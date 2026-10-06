public class Karyawan {
    private String nip;
    private String nama;
    private String jabatan;

    // Constructor tanpa parameter 
    public Karyawan() {
        this.nip = "-";
        this.nama = "-";
        this.jabatan = "-";
    }

    // Constructor berparameter
    public Karyawan(String nip, String nama, String jabatan) {
        this.nip = nip;
        this.nama = nama;
        this.jabatan = jabatan;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJabatan() {
        return jabatan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    public void absen() {
        System.out.println(nama + " (" + nip + ") telah melakukan absensi.");
    }

    public void tampilkanData() {
        System.out.println("NIP     : " + nip);
        System.out.println("Nama    : " + nama);
        System.out.println("Jabatan : " + jabatan);
    }
}