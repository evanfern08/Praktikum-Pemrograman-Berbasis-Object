public class KaryawanKontrak extends Karyawan {
    public double gajiHarian;
    public int jumlahHari;

    public KaryawanKontrak(String nama, String nip, double gajiHarian, int jumlahHari) {
        super(nama, nip);
        this.gajiHarian = gajiHarian;
        this.jumlahHari = jumlahHari;
    }

    // implementasi wajib dari abstract method hitungGaji()
    @Override
    public double hitungGaji() {
        return gajiHarian * jumlahHari;
    }
}
