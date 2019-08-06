package com.cong.http.repository;

import com.cong.http.model.Game;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface GameRepository extends JpaRepository<Game, Long> {

    List<Game> findByUserIdAndResult(Long userId, String result);
    Optional<Game> findById(Long id);
    List<Game> findByUserIdOrderByIdDesc(Long userId);

}