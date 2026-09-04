public class MahasiswaDemo {
    public static void main(String[] args) {
        // Objek 1 (sudah ada di contoh)
        Mahasiswa m1 = new Mahasiswa();
        m1.nim = "023432";
        m1.nama = "Yansy Ayuningtyas";
        m1.alamat = "Nias, Sumatera Utara";
        m1.kelas = "2A";
        m1.displayBiodata();

        // Objek 2 (tambahan - ini yang diminta soal no.12)
        Mahasiswa m2 = new Mahasiswa();
        m2.nim = "023455";
        m2.nama = "Budi Santoso";
        m2.alamat = "Malang, Jawa Timur";
        m2.kelas = "2B";
        m2.displayBiodata();

        // Objek 3 (tambahan - ini yang diminta soal no.12)
        Mahasiswa m3 = new Mahasiswa();
        m3.nim = "023467";
        m3.nama = "Siti Aminah";
        m3.alamat = "Batu, Jawa Timur";
        m3.kelas = "2A";
        m3.displayBiodata();
    }
}