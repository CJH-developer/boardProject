package com.example.boardProject.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.example.boardProject.dto.BoardDTO;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "board")
public class BoardEntity extends BaseEntity{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(length = 20, nullable = false)
	private String boardWriter;
	
	@Column
	private String boardPass;
	
	@Column
	private String boardTitle;
	
	@Column(length=500)
	private String boardContents;
	
	@Column
	private int boardHits;
	
	public static BoardEntity toSaveEntity(BoardDTO boardDTO) {
		BoardEntity boardEntity = new BoardEntity();
		
		boardEntity.setBoardWriter(boardDTO.getBoardWriter());
		boardEntity.setBoardPass(boardDTO.getBoardPass());
		boardEntity.setBoardTitle(boardDTO.getBoardTitle());
		boardEntity.setBoardContents(boardDTO.getBoardContents());
		boardEntity.setBoardHits(0);
		
		return boardEntity;
	}
	
	
}
