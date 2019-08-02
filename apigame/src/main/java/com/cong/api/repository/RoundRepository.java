package com.cong.api.repository;

import java.util.List;

import com.cong.api.model.Game;
import com.cong.api.model.Round;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoundRepository extends JpaRepository<Round, Long> {
    List<Round> findByGameId(Long gameId);
}