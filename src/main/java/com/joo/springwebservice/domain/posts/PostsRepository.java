package com.joo.springwebservice.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PostsRepository extends JpaRepository<Posts, Long> {
    // MyBatis에서 DAO라고 불리는 DB Layer 접근자
    // 위와 같이 상속하면 CRUD 메소드 자동 생성 & @Repository 추가하지 않아도 됨
}
