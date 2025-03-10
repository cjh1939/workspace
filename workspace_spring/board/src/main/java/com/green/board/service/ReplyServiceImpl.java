package com.green.board.service;

import com.green.board.DTO.ReplyDTO;
import com.green.board.mapper.ReplyMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReplyServiceImpl implements ReplyService {
  private ReplyMapper replyMapper;

  @Autowired
  public ReplyServiceImpl (ReplyMapper replyMapper){
    this.replyMapper= replyMapper;

  }


  @Override
  public List<ReplyDTO> getList(int boardNum) {
    return replyMapper.getList(boardNum);
  }

  @Override
  public void insertReply(ReplyDTO replyDTO) {
    replyMapper.insertReply(replyDTO);
  }

  @Override
  public void deleteReply(int replyNum) {
    replyMapper.deleteReply(replyNum);
  }
}
