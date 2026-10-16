public class Main {

    public static void main(String[] args) {

        // ===== Objek ClassA =====
        System.out.println("=== Objek ClassA (induk) ===");
        ClassA a = new ClassA("Objek A");
        a.tampilkanInfo();
        a.methodA();

        // ===== Objek ClassB =====
        System.out.println("\n=== Objek ClassB (turunan A) ===");
        ClassB b = new ClassB("Objek B", 10);
        b.tampilkanInfo();
        b.methodA();   // diwarisi dari A
        b.methodB();   // milik B sendiri

        // ===== Objek ClassC =====
        System.out.println("\n=== Objek ClassC (turunan A) ===");
        ClassC c = new ClassC("Objek C", "Contoh C");
        c.tampilkanInfo();
        c.methodA();   // diwarisi dari A
        c.methodC();   // milik C sendiri

        // ===== Objek ClassD =====
        System.out.println("\n=== Objek ClassD (turunan B, cucu A) ===");
        ClassD d = new ClassD("Objek D", 20, 3.14);
        d.tampilkanInfo();
        d.methodA();   // diwarisi dari A (lewat B)
        d.methodB();   // diwarisi dari B
        d.methodD();   // milik D sendiri
    }
}