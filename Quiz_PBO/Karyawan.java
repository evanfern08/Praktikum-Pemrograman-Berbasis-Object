package Quiz_PBO;

public class Karyawan {
    private String namaKaryawan;
    private String jabatan;

    public Karyawan(String namaKaryawan, String jabatan) {
        this.namaKaryawan = namaKaryawan;
        this.jabatan = jabatan;
    }

    public String getNamaKaryawan() {
        return namaKaryawan;
    }

    public void setNamaKaryawan(String namaKaryawan) {
        this.namaKaryawan = namaKaryawan;
    }

    public String getJabatan() {
        return jabatan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }
}
