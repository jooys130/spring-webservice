package com.joo.springwebservice.domain.posts;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
public class Posts { // 실제 DB 데이블과 매칭 = Entity Class

    @Id // PK field
    // @GeneratedValue // auto_increment
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // MySQL: bingint

    @Column(length = 500, nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    private String author;

    @Builder // 해당 클래스의 빌드패턴 클래스 생성 (생성자가 포함됨)
    public Posts(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }
}