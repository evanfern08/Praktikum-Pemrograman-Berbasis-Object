import java.util.ArrayList;
import java.util.List;

public class Admin extends User {

    // Atribut pendukung
    private List<Vehicle> vehicles = new ArrayList<>();
    private List<String> complains = new ArrayList<>();
    private int nextVehicleId = 1;

    // Constructor
    public Admin(int userId, String password, String name, int age, String emailId) {
        super(userId, password, name, age, emailId);
    }

    // add_vehicle(): Vehicle
    public Vehicle addVehicle() {
        Vehicle v = new Vehicle(nextVehicleId++, "Kendaraan Baru", "Umum");
        vehicles.add(v);
        System.out.println("Kendaraan ditambahkan: " + v);
        return v;
    }

    // update_vehicle_details(vehicle_id)
    public void updateVehicleDetails(int vehicleId) {
        for (Vehicle v : vehicles) {
            if (v.getVehicleId() == vehicleId) {
                System.out.println("Detail kendaraan diperbarui: " + v);
                return;
            }
        }
        System.out.println("Kendaraan dengan ID " + vehicleId + " tidak ditemukan.");
    }

    // Method pendukung: menerima keluhan
    public void receiveComplain(String isi) {
        complains.add(isi);
    }

    // Retrieve_complain()
    public void retrieveComplain() {
        if (complains.isEmpty()) {
            System.out.println("Tidak ada keluhan.");
        } else {
            System.out.println("Daftar keluhan:");
            for (int i = 0; i < complains.size(); i++) {
                System.out.println((i + 1) + ". " + complains.get(i));
            }
        }
    }

    // verify_user()
    public void verifyUser(Customer c) {
        if (c.getProfile().getDoc() != null) {
            c.setVerificationStatus(true);
            System.out.println("Customer " + c.getProfile().getName() + " berhasil diverifikasi.");
        } else {
            System.out.println("Verifikasi ditolak: dokumen belum diunggah.");
        }
    }
}
