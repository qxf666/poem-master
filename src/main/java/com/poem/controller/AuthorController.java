package com.poem.controller;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageInfo;
import com.poem.dto.base.ResultBean;
import com.poem.dto.base.ResultConst;
import com.poem.entity.Author;
import com.poem.pojo.Dynasty;
import com.poem.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/author")
public class AuthorController {
    @Autowired
    private AuthorService authorService;
    @GetMapping(value = "/selectAuthor")
    public ResponseEntity SelectAuthor(@RequestParam(name = "query", required = false) String author,
                                        @RequestParam(name = "pagenum",required = false,defaultValue = "1") Integer pageNum,
                                        @RequestParam(name = "pagesize",required = false,defaultValue = "10") Integer pageSize){
        System.out.println("pageNum"+pageNum+"pageSize"+pageSize);
        PageInfo<Author> pageInfo = authorService.SelectAuthorByName(author, pageNum, pageSize);
        JSONObject resp = new JSONObject().fluentPut("total", pageInfo.getTotal());
        resp.put("authors", pageInfo.getList());
        System.out.println("total的值"+pageInfo.getTotal());
        return new ResponseEntity<>(ResultBean.ok(ResultConst.GET_MANAGERS_SUCC, resp), HttpStatus.OK);
    }
    @GetMapping(value = "/selectAuthorName")
    public ResponseEntity selectAllAuthor(){
        JSONObject resp = new JSONObject();
        resp.put("authors",authorService.selectAllAuthor());
        return new ResponseEntity<>(ResultBean.ok(ResultConst.GET_MANAGERS_SUCC, resp), HttpStatus.OK);
    }
}
