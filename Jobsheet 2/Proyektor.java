public class Proyektor {
    private String merk;
    private String warnaObjek;
    private int tingkatKecerahan;
    private String resolusi;
    private String tipe;
 
    public void nyalakanObjek() {
        System.out.println("Proyektor " + merk + " (" + tipe + ") sedang dinyalakan...");
    }
 
    public void mematikanObjek() {
        System.out.println("Proyektor " + merk + " (" + tipe + ") dimatikan.");
    }
 
    public int aturKecerahan() {
        return tingkatKecerahan;
    }
 
    public void aturVolume() {
        System.out.println("Volume proyektor " + merk + " sedang diatur.");
    }
 
    public void mengubahSumber() {
        System.out.println("Sumber input proyektor " + merk + " sedang diubah.");
    }
 
    // Getter & Setter (dibutuhkan karena atribut bersifat private)
    public String getMerk() {
        return merk;
    }
 
    public void setMerk(String merk) {
        this.merk = merk;
    }
 
    public String getWarnaObjek() {
        return warnaObjek;
    }
 
    public void setWarnaObjek(String warnaObjek) {
        this.warnaObjek = warnaObjek;
    }
 
    public int getTingkatKecerahan() {
        return tingkatKecerahan;
    }
 
    public void setTingkatKecerahan(int tingkatKecerahan) {
        this.tingkatKecerahan = tingkatKecerahan;
    }
 
    public String getResolusi() {
        return resolusi;
    }
 
    public void setResolusi(String resolusi) {
        this.resolusi = resolusi;
    }
 
    public String getTipe() {
        return tipe;
    }
 
    public void setTipe(String tipe) {
        this.tipe = tipe;
    }
 
    public void displayInfo() {
        System.out.println("Merk              : " + merk);
        System.out.println("Warna Objek       : " + warnaObjek);
        System.out.println("Tingkat Kecerahan : " + tingkatKecerahan);
        System.out.println("Resolusi          : " + resolusi);
        System.out.println("Tipe              : " + tipe);
    }
}
 