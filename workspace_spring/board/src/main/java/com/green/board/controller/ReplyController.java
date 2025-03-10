package com.green.board.controller;


import com.green.board.DTO.ReplyDTO;
import com.green.board.DTO.TestDTO;
import com.green.board.service.ReplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.SortedMap;

@RestController
@RequestMapping("/repLies")
public class ReplyController {
  private ReplyService replyService;

  @Autowired
  public ReplyController(ReplyService replyService){
    this.replyService= replyService;

  }
  //댓글 목록 조회
  @GetMapping("/{boardNum}")
public List<ReplyDTO> getList(@PathVariable("boardNum")int boardNum){
    return replyService.getList(boardNum);
}


@PostMapping("")
  public void insertReply(@RequestBody ReplyDTO replyDTO){
    replyService.insertReply(replyDTO);
}

//  @GetMapping("/test")
//  public void test (@RequestParam ("age") int age, @RequestParam("name") String name){
//    System.out.println("age = " + age);
//    System.out.println("name = " + name);
//  }


  @GetMapping("/test")
  public void test (TestDTO testDTO){
    System.out.println(testDTO);
  }

//  댓글 삭제 api
  @DeleteMapping("/{replyNum}")
  public void deleteReply(@PathVariable("replyNum")int replyNum){
    replyService.deleteReply(replyNum);
  }





}
