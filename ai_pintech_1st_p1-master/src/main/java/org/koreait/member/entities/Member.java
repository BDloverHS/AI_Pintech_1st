package org.koreait.member.entities;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 상품 정보를 담는 데이터 클래스 정의
 *
 */
public class Member implements Serializable {

    private String UserId;  // 유저 아이디
    private String UserPass; // 유저 비밀번호
    private String UserName; // 유저 이름
    private String UserBirth; // 유저 생일
    private String UserEmail; // 유저 이메일

    public String getUserId() {
        return UserId;
    }

    public void setUserId(String userId) {
        UserId = userId;
    }

    public String getUserPass() {
        return UserPass;
    }

    public void setUserPass(String userPass) {
        UserPass = userPass;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getUserBirth() {
        return UserBirth;
    }

    public void setUserBirth(String userBirth) {
        UserBirth = userBirth;
    }

    public String getUserEmail() {
        return UserEmail;
    }

    public void setUserEmail(String userEmail) {
        UserEmail = userEmail;
    }

    @Override
    public String toString() {
        return "User{" +
                "UserId=" + UserId +
                ", UserPass='" + UserPass + '\'' +
                ", UserName=" + UserName +
                ", UserBirth=" + UserBirth +
                ", UserEmail=" + UserEmail +
                '}';
    }
}
