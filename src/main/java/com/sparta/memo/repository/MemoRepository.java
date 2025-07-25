package com.sparta.memo.repository;

import com.sparta.memo.entity.Memo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MemoRepository extends JpaRepository<Memo, Long> {

    List<Memo> findAllByOrderByModifiedAtDesc();
    // 메모 table의 sql을 메소드 이름으로 설정할 수 있다.
//    List<Memo> findAllByUsername(String username);

    List<Memo> findAllByContentsContainingOrderByModifiedAtDesc(String keyword);
    // %keyword% 이런식으로 쿼리가 나감
}