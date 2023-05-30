package com.benedsmith.bugTracker.repository;

import com.benedsmith.bugTracker.model.Board;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface BoardRepository extends JpaRepository<Board, String> {

    Optional<Board> findById(String id);
}
