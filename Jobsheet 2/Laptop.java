public class Laptop {
    public String merk;
    public double ukuranLayar;
    public String warna;
    public int volume;

    public void nyalakan() {
        System.out.println(merk + " sedang dinyalakan... layar menyala.");
    }

    public void tambahVolume(int nilai) {
        volume += nilai;
        System.out.println("Volume " + merk + " dinaikkan menjadi " + volume);
    }

    public void pindahTab() {
        System.out.println("Berpindah ke tab berikutnya di laptop " + merk);
    }

    public void displayInfo() {
        System.out.println("Merk         : " + merk);
        System.out.println("Ukuran Layar : " + ukuranLayar + " inch");
        System.out.println("Warna        : " + warna);
        System.out.println("Volume       : " + volume);
    }
}
