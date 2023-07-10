package com.sparta.myselectshop.repository;

import com.sparta.myselectshop.entity.Folder;
import com.sparta.myselectshop.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FolderRepository extends JpaRepository<Folder, Long> {
    List<Folder> findAllByUserAndNameIn(User user, List<String> folderNames);
    // select * from folder where user_id = ? and name in (?, ? , ?);
    // 여러 개를 포함하는지 확인할때 in 사용
    List<Folder> findAllByUser(User user);
}
