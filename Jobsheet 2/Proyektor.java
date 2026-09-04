public class Proyektor {
    public int tingkatKecerahan;
    public String resolusi;
    public String merkType;
    public int volume;
    public String sumberInput;

    public void aturKecerahan(int nilai) {
        tingkatKecerahan = nilai;
        System.out.println("Tingkat kecerahan " + merkType + " diatur ke " + tingkatKecerahan + "%");
    }

    public void aturVolume(int nilai) {
        volume = nilai;
        System.out.println("Volume " + merkType + " diatur ke " + volume);
    }

    public void ubahSumberInput(String sumberBaru) {
        sumberInput = sumberBaru;
        System.out.println("Sumber input " + merkType + " diubah ke " + sumberInput);
    }

    public void displayInfo() {
        System.out.println("Merk/Type         : " + merkType);
        System.out.println("Resolusi          : " + resolusi);
        System.out.println("Tingkat Kecerahan : " + tingkatKecerahan + "%");
        System.out.println("Volume            : " + volume);
        System.out.println("Sumber Input      : " + sumberInput);
    }
}
