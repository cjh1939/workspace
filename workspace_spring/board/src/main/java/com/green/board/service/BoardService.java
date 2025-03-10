package com.green.board.service;

import com.green.board.DTO.BoardDTO;
import com.green.board.DTO.SearchDTO;

import java.util.List;

public interface BoardService {

  public List<BoardDTO> selectBoardList(SearchDTO searchDTO);

  public void boardInsert(BoardDTO boardDTO);

  public BoardDTO selectBoard(int boardNum);

  public void deleteBoard(int boardNum);

  public void boardUpdate(BoardDTO boardDTO);



}
