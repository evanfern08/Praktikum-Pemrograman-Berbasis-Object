public class MainVechile {

    public static void main(String[] args) {

        Customer cust = new Customer(101, "pass123", "Budi", 21, "budi@mail.com");
        Admin admin = new Admin(1, "admin123", "Siti", 30, "siti@mail.com");

        System.out.println("===== ALUR CUSTOMER =====");
        cust.logIn(101, "pass123");
        System.out.println("Status verifikasi: " + cust.getVerificationStatus());
        cust.applyVerification("ktp_budi.pdf");
        cust.getProfile().showDocuments();

        System.out.println("\n===== ALUR ADMIN =====");
        admin.logIn(1, "admin123");
        admin.verifyUser(cust);
        System.out.println("Status verifikasi Customer: " + cust.getVerificationStatus());

        Vehicle v = admin.addVehicle();
        admin.updateVehicleDetails(v.getVehicleId());

        admin.receiveComplain("AC kendaraan tidak dingin");
        admin.retrieveComplain();

        System.out.println("\n===== LOGOUT =====");
        cust.logOut();
        admin.logOut();
    }
}
