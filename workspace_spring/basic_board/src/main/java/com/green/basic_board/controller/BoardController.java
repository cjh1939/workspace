package com.green.basic_board.controller;

import com.green.basic_board.Service.BoardService;
import com.green.basic_board.Service.BoardServiceImpl;
import com.green.basic_board.dto.BoardDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Slf4j
@RestController
@RequestMapping("/boards")
public class BoardController {
  private BoardService boardService;
//인터페이스로 객체 생성

  //만약 클래스 안에 생성자가 1개만 있으면
  //Autowired 를 생략해도 자동으로 @Autowired 를 붙여준다.

  public BoardController(BoardService boardService){
    this.boardService= boardService;
  }


  //게시글 목록 조회 기능을 제공하는 REST API
  //(GET) localhost:8080/boards
  @GetMapping("")
  public List<BoardDTO> gerBoardList(){
  List<BoardDTO> boardList = boardService.selectBoardList();
    return boardList;
  }

  //게시글 하나의 정보를 조회하는 기능을 제공하는 rest api
  //(GET) localhost:8080/boards/1
  @GetMapping("/{boardNum}")
  public BoardDTO getBoard(@PathVariable("boardNum") int boardNum){
    return  boardService.getBoard(boardNum);

  }

  //(POST) localhost:8080/boards
  @PostMapping("")
  public int insertBoard(@RequestBody BoardDTO boardDTO){
    System.out.println(boardDTO);
   return boardService.insertBoard(boardDTO);
  }



}

//프로젝트생성
//테이블 생성
//테이블과 연결될 DTO클래스
//1.xml파일레서 쿼리작성
//2.mapper interface (BoardMapper) 에서 쿼리 실행 메서드 작성
//3.service interface(BoardService) 에서 기능 실행 메서드 작성
//4.serviceImpl클래스에서 메서드 구현
//5.controller에서 serviceImpl에서 구현한 메서드 호출