package Quiz_PBO;

public class Kendaraan {
    private String platNomor;
    private String merek;
    private String model;
    private String tipeKendaraan;
    private Pelanggan pelanggan;

    public Kendaraan(String platNomor, String merek, String model,
                     String tipeKendaraan, Pelanggan pelanggan) {
        this.platNomor = platNomor;
        this.merek = merek;
        this.model = model;
        this.tipeKendaraan = tipeKendaraan;
        this.pelanggan = pelanggan;
    }

    public double hitungBiaya(Layanan layanan) {
    if (tipeKendaraan.equalsIgnoreCase("Mobil")) {
        return layanan.getServicePrice() + 50000;
    } else if (tipeKendaraan.equalsIgnoreCase("Sepeda Motor")) {
        return layanan.getServicePrice() + 20000;
    }

    return layanan.getServicePrice();
    }

    public String getPlatNomor() {
        return platNomor;
    }

    public void setPlatNomor(String platNomor) {
        this.platNomor = platNomor;
    }

    public String getMerek() {
        return merek;
    }

    public void setMerek(String merek) {
        this.merek = merek;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getTipeKendaraan() {
        return tipeKendaraan;
    }

    public void setTipeKendaraan(String tipeKendaraan) {
        this.tipeKendaraan = tipeKendaraan;
    }

    public Pelanggan getPelanggan() {
        return pelanggan;
    }

    public void setPelanggan(Pelanggan pelanggan) {
        this.pelanggan = pelanggan;


    }
}
