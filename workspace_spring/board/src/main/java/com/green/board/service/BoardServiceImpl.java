package com.green.board.service;


import com.green.board.DTO.BoardDTO;
import com.green.board.DTO.SearchDTO;
import com.green.board.mapper.BoardMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardServiceImpl implements  BoardService{

  private BoardMapper boardMapper;


  @Autowired
  public BoardServiceImpl(BoardMapper boardMapper){
    this.boardMapper = boardMapper;
  }


  @Override
  public List<BoardDTO> selectBoardList(SearchDTO searchDTO) {
    return boardMapper.selectBoardList(searchDTO);
  }

  @Override
  public void boardInsert(BoardDTO boardDTO) {
    boardMapper.boardInsert(boardDTO);
  }

  //상세기능정보
  @Override
  public BoardDTO selectBoard(int boardNum) {
    //조회수 증가 쿼리
    boardMapper.readCnt(boardNum);
    return boardMapper.selectBoard(boardNum);
  }

  @Override
  public void deleteBoard(int boardNum) {
    boardMapper.deleteBoard(boardNum);
  }

  @Override
  public void boardUpdate(BoardDTO boardDTO) {

    boardMapper.boardUpdate(boardDTO);
  }




}
