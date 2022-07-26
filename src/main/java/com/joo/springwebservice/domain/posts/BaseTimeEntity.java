package com.joo.springwebservice.domain.posts;

import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@Getter
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class BaseTimeEntity {

    @CreatedDate // 저장되는 시간 자동 저장
    private LocalDateTime createdDate;

    @LastModifiedDate // 변경하는 시간 자동 저장
    private LocalDateTime modifiedDate;

}
