package com.example.boardProject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.boardProject.dto.BoardDTO;
import com.example.boardProject.entity.BoardEntity;
import com.example.boardProject.repository.BoardRepository;

@Service
public class BoardService {
	
	@Autowired
	private BoardRepository boardRepository;

	// 저장
	public void save(BoardDTO boardDTO) {
		BoardEntity boardEntity = BoardEntity.toSaveEntity(boardDTO);
		boardRepository.save(boardEntity);
	}

}
