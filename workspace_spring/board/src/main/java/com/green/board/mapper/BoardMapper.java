package com.green.board.mapper;

import com.green.board.DTO.BoardDTO;
import com.green.board.DTO.SearchDTO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Mapper
public interface BoardMapper {

  public List<BoardDTO> selectBoardList(SearchDTO searchDTO);

  public void boardInsert(BoardDTO boardDTO);

  public BoardDTO selectBoard(int boardNum);

  public void deleteBoard(int boardNum);

  public void boardUpdate(BoardDTO boardDTO);

  public void readCnt (int boardNum);

}
