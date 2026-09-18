package Bengkel;

import java.time.LocalDate;
import java.util.ArrayList;
 
public class Pelanggan {
    private String idPelanggan;
    private String nama;
    private ArrayList<Servis> riwayatServis;
 
    public Pelanggan(String idPelanggan, String nama) {
        this.idPelanggan = idPelanggan;
        this.nama = nama;
        this.riwayatServis = new ArrayList<Servis>();
    }
 
    public String getIdPelanggan() {
        return idPelanggan;
    }
 
    public String getNama() {
        return nama;
    }
 
    public void setNama(String nama) {
        this.nama = nama;
    }
 
    public void tambahServis(LocalDate tanggal, Montir montir, String keluhan) {
        Servis servis = new Servis();
        servis.setTanggal(tanggal);
        servis.setMontir(montir);
        servis.setKeluhan(keluhan);
        riwayatServis.add(servis);
    }
 
    public String getInfo() {
        String info = "";
        info += "ID Pelanggan   : " + this.idPelanggan + "\n";
        info += "Nama           : " + this.nama + "\n";
 
        if (!riwayatServis.isEmpty()) {
            info += "Riwayat Servis :\n";
 
            for (Servis servis : riwayatServis) {
                info += servis.getInfo();
            }
        }
        else {
            info += "Belum ada riwayat servis";
        }
 
        info += "\n";
 
        return info;
    }    
}
