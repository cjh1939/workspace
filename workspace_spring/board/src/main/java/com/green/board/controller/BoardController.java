package com.green.board.controller;

import com.green.board.DTO.BoardDTO;
import com.green.board.DTO.SearchDTO;
import com.green.board.mapper.BoardMapper;
import com.green.board.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("boards")
@RestController
public class BoardController {
  private BoardService boardService;


  @Autowired
  public BoardController (BoardService boardService){
    this.boardService = boardService;
  }


/* 검색버튼 게시글 목록 조회 */
  @GetMapping("")
  public List<BoardDTO> selectBoardList (SearchDTO searchDTO){
    System.out.println(searchDTO);
    return boardService.selectBoardList(searchDTO);
  }

  @PostMapping("")
  public void boardInsert(@RequestBody BoardDTO boardDTO){
    boardService.boardInsert(boardDTO);
  }

  //상세조회
  @GetMapping("/{boardNum}")
  public BoardDTO selectBoard(@PathVariable("boardNum") int boardNum){
    return boardService.selectBoard(boardNum);
  }

  @DeleteMapping("/{boardNum}")
  public void deleteBoard(@PathVariable("boardNum")int boardNum){
    boardService.deleteBoard(boardNum);
  }

  @PutMapping("/{boardNum}")
  public void boardUpdate(@PathVariable("boardNum") int boardNum, @RequestBody BoardDTO boardDTO){
      boardDTO.setBoardNum(boardNum);
      boardService.boardUpdate(boardDTO);

  }



}
