

public class ClassA {
    protected String nama;

    public ClassA(String nama) {
        this.nama = nama;
    }

    public void tampilkanInfo() {
        System.out.println("[ClassA] Nama      : " + nama);
    }

    public void methodA() {
        System.out.println("methodA() dijalankan dari ClassA");
    }
}