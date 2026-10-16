public class ClassC extends ClassA {

    // Atribut
    protected String atributC;

    // Constructor
    public ClassC(String nama, String atributC) {
        super(nama);
        this.atributC = atributC;
    }

    // Getter dan setter
    public String getAtributC() {
        return atributC;
    }

    public void setAtributC(String atributC) {
        this.atributC = atributC;
    }

    // Method (overriding dari ClassA)
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("[ClassC] Atribut C : " + atributC);
    }

    public void methodC() {
        System.out.println("methodC() dijalankan dari ClassC");
    }
}