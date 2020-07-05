package com.poem.controller;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageInfo;
import com.poem.dto.base.ResultBean;
import com.poem.dto.base.ResultConst;
import com.poem.pojo.PoemCollection;
import com.poem.pojo.ResultPoem;
import com.poem.service.PoemService;
import com.poem.service.impl.PoemServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/poem")
public class PoemSelectController {
    @Autowired
    private PoemService poemService;
    @GetMapping(value = "/poemList" )
    public ResponseEntity findPage(@RequestParam(name = "query", required = false) String poemName,
                                   @RequestParam(name = "pagenum",required = false,defaultValue = "1") Integer pageNum,
                                   @RequestParam(name = "pagesize",required = false,defaultValue = "10") Integer pageSize){
        System.out.println("pageNum"+pageNum+"pageSize"+pageSize);
        PageInfo<ResultPoem> pageInfo = poemService.selectByPoemName(poemName, pageNum, pageSize);
        JSONObject resp = new JSONObject().fluentPut("total", pageInfo.getTotal());
        resp.put("poems", pageInfo.getList());
        System.out.println("total的值"+pageInfo.getTotal());
        return new ResponseEntity<>(ResultBean.ok(ResultConst.GET_MANAGERS_SUCC, resp), HttpStatus.OK);
    }
    @GetMapping(value = "/poemList1" )
    public ResponseEntity findPage1(
                                   @RequestParam(name = "pagenum",required = false,defaultValue = "1") Integer pageNum,
                                   @RequestParam(name = "pagesize",required = false,defaultValue = "10") Integer pageSize){
        System.out.println("pageNum"+pageNum+"pageSize"+pageSize);
        PageInfo<PoemCollection> pageInfo = poemService.SelectPoem(pageNum,pageSize);
        JSONObject resp = new JSONObject().fluentPut("total", pageInfo.getTotal());
        resp.put("poems", pageInfo.getList());
        System.out.println("total的值"+pageInfo.getTotal());
        return new ResponseEntity<>(ResultBean.ok(ResultConst.GET_MANAGERS_SUCC, resp), HttpStatus.OK);
    }
}