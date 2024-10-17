package exam02;

public class LoginService {
    public void process(String userId, String password) {
        // userId - user01, password - 1234
        if (!userId.equals("user01")) {
            throw new UserIdValidationException("아이디가 일치하지 않습니다.");
        }

        if (!password.equals("1234")) {
            throw new PasswordVlidationException("비밀번호가 일치하지 않습니다.");
        }
    }
}
