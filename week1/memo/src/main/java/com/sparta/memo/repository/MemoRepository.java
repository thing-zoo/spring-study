package com.sparta.memo.repository;

import com.sparta.memo.entity.Memo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MemoRepository extends JpaRepository<Memo, Long> { // <Entitiy, Id>
    List<Memo> findAllByOrderByModifiedAtDesc();
    List<Memo> findAllByUsername(String username);


}
