public class KaryawanTetap extends Karyawan {
    private double tunjanganPensiun;

    // Constructor tanpa parameter 
    public KaryawanTetap() {
        super();
        this.tunjanganPensiun = 0;
    }

    // Constructor berparameter
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

    public void hitungGajiTahunan(double gajiBulanan) {
        double gajiTahunan = (gajiBulanan * 12) + tunjanganPensiun;
        System.out.println("Gaji Tahunan " + getNama() + " (termasuk tunjangan pensiun): Rp" 
            + String.format("%,.0f", gajiTahunan));
    }
}