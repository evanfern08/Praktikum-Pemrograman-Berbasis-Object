public class ProyektorDemo {
    public static void main(String[] args) {
        // Objek pertama
        Proyektor proyektor1 = new Proyektor();
        proyektor1.merkType = "Epson EB-X06";
        proyektor1.resolusi = "1024x768";
        proyektor1.tingkatKecerahan = 70;
        proyektor1.volume = 20;
        proyektor1.sumberInput = "HDMI";

        System.out.println("=== Data Awal Proyektor 1 ===");
        proyektor1.displayInfo();

        proyektor1.aturKecerahan(85);
        proyektor1.aturVolume(30);
        proyektor1.ubahSumberInput("VGA");

        System.out.println();

        // Objek kedua
        Proyektor proyektor2 = new Proyektor();
        proyektor2.merkType = "BenQ MW535A";
        proyektor2.resolusi = "1280x800";
        proyektor2.tingkatKecerahan = 60;
        proyektor2.volume = 15;
        proyektor2.sumberInput = "USB-C";

        System.out.println("=== Data Awal Proyektor 2 ===");
        proyektor2.displayInfo();

        proyektor2.aturKecerahan(90);
        proyektor2.aturVolume(25);
        proyektor2.ubahSumberInput("HDMI");

        System.out.println();

        // Update nilai atribut masing-masing objek
        System.out.println("=== Setelah Update Atribut ===");
        proyektor1.resolusi = "1280x1024";
        proyektor1.displayInfo();

        System.out.println();

        proyektor2.merkType = "BenQ MW535A (Ruang Aula)";
        proyektor2.displayInfo();
    }
}
