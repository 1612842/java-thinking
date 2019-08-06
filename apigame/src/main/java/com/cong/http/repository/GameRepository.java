package com.cong.http.repository;

import java.util.List;

import com.cong.http.model.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
    List<Game> findByUserIdAndResult(Long userId, String result);
    List<Game> findByUserIdOrderByIdDesc(Long userId);

}