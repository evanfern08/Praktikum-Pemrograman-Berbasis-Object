public class User {

    // COMPOSITION: UserProfile dibuat di dalam User dan hidup bersama User
    private UserProfile profile;

    // Constructor
    public User(int userId, String password, String name, int age, String emailId) {
        this.profile = new UserProfile(userId, password, name, age, emailId);
    }

    public UserProfile getProfile() {
        return profile;
    }

    // log_in(user_id, password)
    public boolean logIn(int userId, String password) {
        if (profile.getUserId() == userId && profile.getPassword().equals(password)) {
            System.out.println("Login berhasil. Selamat datang, " + profile.getName() + "!");
            return true;
        }
        System.out.println("Login gagal: user_id atau password salah.");
        return false;
    }

    // recover_password()
    public void recoverPassword() {
        System.out.println("Link pemulihan password dikirim ke " + profile.getEmail());
    }

    // log_out()
    public void logOut() {
        System.out.println(profile.getName() + " telah logout.");
    }
}
