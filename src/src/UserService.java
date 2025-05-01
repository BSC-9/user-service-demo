public class UserServiceTest {
    public static void main(String[] args) {
        UserService service = new UserService();
        assert service.getUser().contains("User") : "Test failed!";
        System.out.println("Test passed.");
    }
}
