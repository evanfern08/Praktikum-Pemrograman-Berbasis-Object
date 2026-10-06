public class KaryawanTetap extends Karyawan {
    private double tunjanganPensiun;

    public KaryawanTetap(String nip, String nama, String jabatan, double tunjanganPensiun) {
        super(nip, nama, jabatan);
        this.tunjanganPensiun = tunjanganPensiun;
    }

    public double getTunjanganPensiun() {
        return tunjanganPensiun;
    }

    public void setTunjanganPensiun(double tunjanganPensiun) {
        this.tunjanganPensiun = tunjanganPensiun;
    }

    // Override: menimpa absen() milik Karyawan dengan perilaku khusus KaryawanTetap
    @Override
    public void absen() {
        System.out.println(getNama() + " (" + getNip() + ") absen via fingerprint kantor.");
    }

    public void hitungGajiTahunan(double gajiBulanan) {
        double gajiTahunan = (gajiBulanan * 12) + tunjanganPensiun;
        System.out.println("Gaji Tahunan " + getNama() + " (termasuk tunjangan pensiun): Rp"
            + String.format("%,.0f", gajiTahunan));
    }
}