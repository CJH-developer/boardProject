package com.example.boardProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.boardProject.dto.BoardDTO;
import com.example.boardProject.service.BoardService;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
@RequestMapping("/board")
public class BoardController {

	private final BoardService boardSerivce;
	
	@GetMapping("/save")
	public String saveForm() {
		return "save";
	}
	
	@PostMapping("/save")
	public String save(@ModelAttribute BoardDTO boardDTO) {
		boardSerivce.save(boardDTO);
		return "index";
	}
}
