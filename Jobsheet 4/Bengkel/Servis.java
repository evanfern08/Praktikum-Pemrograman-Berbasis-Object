package Bengkel;

import java.time.LocalDate;
 
public class Servis {
    private LocalDate tanggal;
    private String keluhan;
    private Montir montir;
    private double biaya;
 
    public LocalDate getTanggal() {
        return tanggal;
    }
 
    public void setTanggal(LocalDate tanggal) {
        this.tanggal = tanggal;
    }
 
    public String getKeluhan() {
        return keluhan;
    }
 
    public void setKeluhan(String keluhan) {
        this.keluhan = keluhan;
    }
 
    public Montir getMontir() {
        return montir;
    }
 
    public void setMontir(Montir montir) {
        this.montir = montir;
    }
 
    public double getBiaya() {
        return biaya;
    }
 
    public void setBiaya(double biaya) {
        this.biaya = biaya;
    }
 
    public String getInfo() {
        String info = "";
        info += "\tTanggal: " + tanggal;
        info += ", Keluhan: " + keluhan;
        info += ", Montir: " + montir.getInfo();
        info += ", Biaya: Rp" + biaya;
        info += "\n";
 
        return info;
    }    
}
