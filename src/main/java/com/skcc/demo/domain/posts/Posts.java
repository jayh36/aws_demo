package com.skcc.demo.domain.posts;

import com.skcc.demo.domain.BaseTimeEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor // 기본 생성자 자동추가 public Posts(){}
@Entity // 테이블과 링크될 클래스
public class Posts extends BaseTimeEntity {

    @Id // PK
    @GeneratedValue(strategy = GenerationType.IDENTITY) // PK생성규칙 : auto_increment
    private Long id;

    @Column(length = 500, nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    private String author;

    @Builder // 해당 클래스의 빌더 패턴 클래스를 생성, 생성자 상단에 선언 시 생성자에 포함된 필드만 빌더에 포함
    public Posts(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }
    // Entity 클래스에서는 절대 Setter 메소드를 만들지 않는다. 차후 변경 시 복잡해지므로 대신 메소드로 추가
    public void update(String title, String content) {
        this.title = title;
        this.content = content;
    }
}
