package com.cong.http.repository;

import java.util.List;
import java.util.Optional;

import com.cong.http.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
    Boolean existsByUsername(String username);
    Boolean existsByEmail(String email);

    @Query(value="SELECT * FROM users order by users.win_rounds/users.total_rounds desc limit 100",nativeQuery = true)
    List<User> findTop100WinRate();
}