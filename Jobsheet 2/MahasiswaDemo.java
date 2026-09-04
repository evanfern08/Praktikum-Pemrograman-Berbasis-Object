public class MahasiswaDemo {
    public static void main(String[] args) {
        // Objek 1 (sudah ada di contoh)
        Mahasiswa m1 = new Mahasiswa();
        m1.nim = "023432";
        m1.nama = "Yansy Ayuningtyas";
        m1.alamat = "Nias, Sumatera Utara";
        m1.kelas = "2A";
        m1.displayBiodata();

        // Objek 2 (tambahan - yang diminta soal no.12)
        Mahasiswa m2 = new Mahasiswa();
        m2.nim = "023455";
        m2.nama = "Evan Fernanda";
        m2.alamat = "Malang, Jawa Timur";
        m2.kelas = "2F";
        m2.displayBiodata();

        // Objek 3 (tambahan - yang diminta soal no.12)
        Mahasiswa m3 = new Mahasiswa();
        m3.nim = "023467";
        m3.nama = "Aylafada syakira";
        m3.alamat = "Batu, Jawa Timur";
        m3.kelas = "2D";
        m3.displayBiodata();
    }
}