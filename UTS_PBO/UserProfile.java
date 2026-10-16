public class UserProfile {

    // Atribut (sesuai diagram: semua private)
    private int userId;
    private String password;
    private String name;
    private int age;
    private String emailId;
    private String doc;   // dokumen: .jpg, .png, .pdf

    // Constructor
    public UserProfile(int userId, String password, String name, int age, String emailId) {
        this.userId = userId;
        this.password = password;
        this.name = name;
        this.age = age;
        this.emailId = emailId;
        this.doc = null;
    }

    // Getter (sesuai diagram)
    public int getUserId() {
        return userId;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return emailId;
    }

    public String getDoc() {
        return doc;
    }

    public void setDoc(String doc) {
        this.doc = doc;
    }

    // edit_profile()
    public void editProfile(String name, int age, String emailId) {
        this.name = name;
        this.age = age;
        this.emailId = emailId;
        System.out.println("Profil berhasil diperbarui.");
    }

    // show_documents()
    public void showDocuments() {
        if (doc == null) {
            System.out.println("Belum ada dokumen yang diunggah.");
        } else {
            System.out.println("Dokumen: " + doc);
        }
    }
}
