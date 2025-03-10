package com.green.rest.controller;


import com.green.rest.dto.BoarDTO;
import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RequestMapping
@RestController
@Slf4j
public class BoardController {
  //1.모든게시글을 조회 하는 기능을 제공하는 rest api
  //2.하나의 게글의 정보를 조회하는 기능을 제공하는 rest api
  //3.하나의 게시글을 등록하는 기능을 제공하는 rest api

  @GetMapping("/boards")
  public void memberDTO(){
    log.info("게시글 목록 조회");

    System.out.println("모든게시글 조회");
  }

  @GetMapping("/boards/{boardNum}")
  public void memberDT(@PathVariable("boardNum") int boardNum ){
    log.info("게시글 상세 정보 조회");
    System.out.println(boardNum);
  }

  @PostMapping("/boards")
  public void member(@RequestBody BoarDTO boarDTO){
    log.info("게시글 등록");
    log.info(boarDTO.toString());
  }
























}
