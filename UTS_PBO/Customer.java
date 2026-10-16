public class Customer extends User {

    // Atribut (sesuai diagram: private, default FALSE)
    private boolean verificationStatus = false;

    // Constructor
    public Customer(int userId, String password, String name, int age, String emailId) {
        super(userId, password, name, age, emailId);
    }

    // get_verification_status()
    public boolean getVerificationStatus() {
        return verificationStatus;
    }

    // Method pendukung: dipanggil oleh Admin.verifyUser() (package-private)
    void setVerificationStatus(boolean status) {
        this.verificationStatus = status;
    }

    // apply_verification(doc: .jpg, .png, .pdf)
    public void applyVerification(String doc) {
        String d = doc.toLowerCase();
        if (d.endsWith(".jpg") || d.endsWith(".png") || d.endsWith(".pdf")) {
            getProfile().setDoc(doc);
            System.out.println("Pengajuan verifikasi terkirim. Menunggu persetujuan Admin.");
        } else {
            System.out.println("Format dokumen tidak valid (harus .jpg, .png, atau .pdf).");
        }
    }
}
