package com.example.boardProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.boardProject.entity.BoardEntity;

public interface BoardRepository extends JpaRepository<BoardEntity, Long>{

}
