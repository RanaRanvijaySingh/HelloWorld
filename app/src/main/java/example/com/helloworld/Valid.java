package example.com.helloworld;

public class Valid {

    public static boolean email(String email) {
        return email != null
                && email.length() >= 5
                && email.contains("@")
                && email.contains(".");
    }
}
