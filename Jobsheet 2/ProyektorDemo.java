public class ProyektorDemo {
    public static void main(String[] args) {
        // Objek pertama
        Proyektor proyektor1 = new Proyektor();
        proyektor1.setMerk("Epson EB-X06");
        proyektor1.setWarnaObjek("Putih");
        proyektor1.setTingkatKecerahan(70);
        proyektor1.setResolusi("1024x768");
        proyektor1.setTipe("XGA");
 
        System.out.println("=== Data Awal Proyektor 1 ===");
        proyektor1.displayInfo();
 
        proyektor1.nyalakanObjek();
        System.out.println("Tingkat kecerahan saat ini: " + proyektor1.aturKecerahan());
        proyektor1.aturVolume();
        proyektor1.mengubahSumber();
 
        System.out.println();
 
        // Objek kedua
        Proyektor proyektor2 = new Proyektor();
        proyektor2.setMerk("BenQ MW535A");
        proyektor2.setWarnaObjek("Hitam");
        proyektor2.setTingkatKecerahan(60);
        proyektor2.setResolusi("1280x800");
        proyektor2.setTipe("WXGA");
 
        System.out.println("=== Data Awal Proyektor 2 ===");
        proyektor2.displayInfo();
 
        proyektor2.nyalakanObjek();
        System.out.println("Tingkat kecerahan saat ini: " + proyektor2.aturKecerahan());
        proyektor2.aturVolume();
        proyektor2.mengubahSumber();
 
        System.out.println();
 
        // Update nilai atribut masing-masing objek
        System.out.println("=== Setelah Update Atribut ===");
        proyektor1.setTingkatKecerahan(90);
        proyektor1.displayInfo();
        System.out.println("Tingkat kecerahan setelah diupdate: " + proyektor1.aturKecerahan());
 
        System.out.println();
 
        proyektor2.setResolusi("1920x1080");
        proyektor2.displayInfo();
 
        System.out.println();
        proyektor1.mematikanObjek();
        proyektor2.mematikanObjek();
    }
}
 
