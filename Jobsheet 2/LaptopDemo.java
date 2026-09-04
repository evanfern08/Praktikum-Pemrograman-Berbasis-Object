public class LaptopDemo {
    public static void main(String[] args) {
        // Objek pertama
        Laptop laptop1 = new Laptop();
        laptop1.merk = "Asus ROG";
        laptop1.ukuranLayar = 15.6;
        laptop1.warna = "Hitam";
        laptop1.volume = 30;

        System.out.println("=== Data Awal Laptop 1 ===");
        laptop1.displayInfo();

        laptop1.nyalakan();
        laptop1.tambahVolume(10);
        laptop1.pindahTab();

        System.out.println();

        // Objek kedua
        Laptop laptop2 = new Laptop();
        laptop2.merk = "MacBook Air";
        laptop2.ukuranLayar = 13.3;
        laptop2.warna = "Silver";
        laptop2.volume = 20;

        System.out.println("=== Data Awal Laptop 2 ===");
        laptop2.displayInfo();

        laptop2.nyalakan();
        laptop2.tambahVolume(15);
        laptop2.pindahTab();

        System.out.println();

        // Update nilai atribut masing-masing objek
        System.out.println("=== Setelah Update Atribut ===");
        laptop1.warna = "Merah";
        laptop1.displayInfo();

        System.out.println();

        laptop2.ukuranLayar = 14.0;
        laptop2.displayInfo();
    }
}
