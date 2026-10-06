public class KaryawanDemo {
    public static void main(String[] args) {
        // Constructor berparameter 
        KaryawanTetap tetap = new KaryawanTetap("K001", "Budi Santoso", "Manajer", 5000000);
        tetap.tampilkanData();
        tetap.absen();
        tetap.hitungGajiTahunan(10000000);

        System.out.println("=========================");

        KaryawanKontrak kontrak = new KaryawanKontrak("K002", "Siti Aminah", "Staff IT", "2026-12-31");
        kontrak.tampilkanData();
        kontrak.absen();
        kontrak.cekMasaKontrak();

        System.out.println("=========================");

        // Constructor tanpa parameter
        KaryawanTetap tetapKosong = new KaryawanTetap();
        System.out.println("Data awal (constructor tanpa parameter):");
        tetapKosong.tampilkanData();
        System.out.println("Tunjangan Pensiun: " + tetapKosong.getTunjanganPensiun());

        System.out.println("=========================");

        // modifikasi atribut setelah ada object
        System.out.println("Memodifikasi data tetapKosong...");
        tetapKosong.setNip("K003");                  
        tetapKosong.setNama("Dewi Lestari");          
        tetapKosong.setJabatan("Supervisor");         
        tetapKosong.setTunjanganPensiun(3000000);     

        System.out.println("Data setelah dimodifikasi:");
        tetapKosong.tampilkanData();
        tetapKosong.hitungGajiTahunan(8000000);

        System.out.println("=========================");

        KaryawanKontrak kontrakKosong = new KaryawanKontrak();
        kontrakKosong.setNip("K004");                              
        kontrakKosong.setNama("Rudi Hartono");                    
        kontrakKosong.setJabatan("Staff Marketing");           
        kontrakKosong.setTanggalBerakhirKontrak("2027-06-30");   

        System.out.println("Data kontrakKosong setelah diisi lewat setter:");
        kontrakKosong.tampilkanData();
        kontrakKosong.cekMasaKontrak();
    }
}