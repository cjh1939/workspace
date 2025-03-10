package com.green.board.service;

import com.green.board.DTO.ReplyDTO;

import java.util.List;

public interface ReplyService  {

//댓글 목록 조회 쿼리
  public List<ReplyDTO> getList(int boardNum);
//댓글 등록 쿼리
  public void insertReply(ReplyDTO replyDTO);

  // 댓글 삭제 쿼리
  public void deleteReply(int replyNum);

}
