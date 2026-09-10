public class Anggota {
    private String nomorKTP;
    private String nama;
    private double limitPinjaman;
    private double jumlahPinjaman;

    public Anggota(String nomorKTP, String nama, double limitPinjaman) {
        this.nomorKTP = nomorKTP;
        this.nama = nama;
        this.limitPinjaman = limitPinjaman;
        this.jumlahPinjaman = 0;
    }

    public String getNomorKTP() {
        return nomorKTP;
    }

    public String getNama() {
        return nama;
    }

    public double getLimitPinjaman() {
        return limitPinjaman;
    }

    public double getJumlahPinjaman() {
        return jumlahPinjaman;
    }

    public void pinjam(double nominal) {
        if (this.jumlahPinjaman + nominal > this.limitPinjaman) {
            System.out.println("Maaf, jumlah pinjaman melebihi limit.");
        }
        else {
            this.jumlahPinjaman += nominal;
        }
    }

    public void angsur(double nominal) {
        double minimalAngsuran = 0.1 * this.jumlahPinjaman;

        if (nominal < minimalAngsuran) {
            System.out.println("Maaf, angsuran harus 10% dari jumlah pinjaman");
        }
        else {
            this.jumlahPinjaman -= nominal;
        }
    }
}