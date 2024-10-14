package exam05;

public class LoginService {

    private static LoginService instance;

    private LoginService() {}

    // 인스턴스 메서드이므로 객체가 생성되어 있어야함.
    public static LoginService getInstance() {
        if(instance == null) {
            instance = new LoginService();
        }
        return instance;
    }

    public void login(String userId, String password) {

    }
}