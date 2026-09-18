package Bengkel;

public class Montir {
    private String idMontir;
    private String nama;
    private String spesialisasi;
 
    public Montir(String idMontir, String nama) {
        this.idMontir = idMontir;
        this.nama = nama;
    }
 
    public String getIdMontir() {
        return idMontir;
    }
 
    public void setIdMontir(String idMontir) {
        this.idMontir = idMontir;
    }
 
    public String getNama() {
        return nama;
    }
 
    public void setNama(String nama) {
        this.nama = nama;
    }
 
    public String getSpesialisasi() {
        return spesialisasi;
    }
 
    public void setSpesialisasi(String spesialisasi) {
        this.spesialisasi = spesialisasi;
    }
 
    public String getInfo() {
        return nama + " (" + idMontir + ")";
    }
}
 
