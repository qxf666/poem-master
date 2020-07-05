package com.poem.controller;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageInfo;
import com.poem.dto.base.ResultBean;
import com.poem.dto.base.ResultConst;
import com.poem.entity.PoemMusic;
import com.poem.pojo.ResultPoem;
import com.poem.service.MusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/music")
public class MusicController {
    @Autowired
    private MusicService musicService;
    @GetMapping("/musicList")
    public ResponseEntity selectByMusicName(@RequestParam String musicName){
        System.out.println(musicName+"-------------------==========\\\\\\\\");
        List<PoemMusic> songs=musicService.selectMusic(musicName);
        JSONObject resp = new JSONObject().fluentPut("songs", songs);
        return new ResponseEntity<>(ResultBean.ok(ResultConst.Select_Music_SUCC, resp), HttpStatus.OK);
    }
    @GetMapping("/musicUrl")
    public ResponseEntity selectByMusicId(@RequestParam int id){
        System.out.println(id);
        PoemMusic musicUrl=musicService.selectMusicUrl(id);
        JSONObject resp=new JSONObject().fluentPut("musicUrl",musicUrl);
        return new ResponseEntity<>(ResultBean.ok(ResultConst.Select_Music_SUCCUrl,resp),HttpStatus.OK);
    }
}
