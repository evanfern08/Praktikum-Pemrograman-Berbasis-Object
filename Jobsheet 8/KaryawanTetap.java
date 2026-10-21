public class KaryawanTetap extends Karyawan {
    public double gajiPokok;
    public double tunjangan;

    public KaryawanTetap(String nama, String nip, double gajiPokok, double tunjangan) {
        super(nama, nip);
        this.gajiPokok = gajiPokok;
        this.tunjangan = tunjangan;
    }

    // implementasi wajib dari abstract method hitungGaai()
    @Override
    public double hitungGaji() {
        return gajiPokok + tunjangan;
    }
}
