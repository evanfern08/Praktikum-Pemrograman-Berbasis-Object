package Bengkel;

import java.time.LocalDate;
 
public class BengkelDemo {
    public static void main(String[] args) {
        Montir budi = new Montir("M001", "Budi");
        Montir andi = new Montir("M002", "Andi");
 
        Pelanggan pelanggan1 = new Pelanggan("P001", "Rizky Pratama");
        pelanggan1.tambahServis(LocalDate.of(2024, 3, 10), budi, "Ganti oli dan servis rutin");
        pelanggan1.tambahServis(LocalDate.of(2024, 6, 15), andi, "Rem blong");
 
        System.out.println(pelanggan1.getInfo());
 
        Pelanggan pelanggan2 = new Pelanggan("P002", "Siti Nurhaliza");
        System.out.println(pelanggan2.getInfo());
    }
}
