public class ClassD extends ClassB {

    // Atribut
    protected double atributD;

    // Constructor
    public ClassD(String nama, int nilaiB, double atributD) {
        super(nama, nilaiB);
        this.atributD = atributD;
    }

    // Getter dan setter
    public double getAtributD() {
        return atributD;
    }

    public void setAtributD(double atributD) {
        this.atributD = atributD;
    }

    // Method (overriding dari ClassB)
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("[ClassD] Atribut D : " + atributD);
    }

    public void methodD() {
        System.out.println("methodD() dijalankan dari ClassD");
    }
}