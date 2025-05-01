public class UserService {
    public String getUser() {
        return "User from feature branch";

    }

    public static void main(String[] args) {
        System.out.println(new UserService().getUser());
    }
}
