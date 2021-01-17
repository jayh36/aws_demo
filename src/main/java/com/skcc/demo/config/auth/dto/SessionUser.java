package com.skcc.demo.config.auth.dto;

import com.skcc.demo.domain.user.User;
import lombok.Getter;
import java.io.Serializable;

@Getter
public class SessionUser implements Serializable { // 인증된 사용자 정보만 필요, 직력화 기능을 가진 세션 Dto를 따로 생성 User클래스 사용시 성능,부수효과 발생
    private String name;
    private String email;
    private String picture;

    public SessionUser(User user) {
        this.name = user.getName();
        this.email = user.getEmail();
        this.picture = user.getPicture();
    }
}
