package com.skcc.demo.domain;

import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@Getter
@MappedSuperclass // BaseTimeEntity를 상속할 경우 필드들도 칼럼으로 인식하도록 함
@EntityListeners(AuditingEntityListener.class) // Auditing 기능 포함시킴
public abstract class BaseTimeEntity {

    @CreatedDate // 엔티티가 생성되어 저장될 떄 시간이 자동 저장됨
    private LocalDateTime createdDate;

    @LastModifiedDate //변경시 시간 자동 저장
    private LocalDateTime modifiedDate;

}
