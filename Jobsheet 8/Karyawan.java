public abstract class Karyawan {
    public String nama;
    public String nip;

    public Karyawan(String nama, String nip) {
        this.nama = nama;
        this.nip = nip;
    }

    // concrete method: sudah punya implementasi, dipakai bersama oleh semua subclass
    public void cetakInfo() {
        System.out.println("Nama : " + nama);
        System.out.println("NIP  : " + nip);
        System.out.println("Gaji : " + hitungGaji());
    }

    // abstract method: belum ada implementasi, wajib di-override oleh subclass
    public abstract double hitungGaji();
}
