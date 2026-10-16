public class ClassB extends ClassA {

    // Atribut
    protected int nilaiB;

    // Constructor
    public ClassB(String nama, int nilaiB) {
        super(nama);
        this.nilaiB = nilaiB;
    }

    // Getter dan setter
    public int getNilaiB() {
        return nilaiB;
    }

    public void setNilaiB(int nilaiB) {
        this.nilaiB = nilaiB;
    }

    // Method (overriding dari ClassA)
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("[ClassB] Nilai B   : " + nilaiB);
    }

    public void methodB() {
        System.out.println("methodB() dijalankan dari ClassB");
    }
}