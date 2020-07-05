package com.poem.controller;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageInfo;
import com.poem.dto.base.ResultBean;
import com.poem.dto.base.ResultConst;
import com.poem.pojo.Dynasty;
import com.poem.pojo.ResultPoem;
import com.poem.service.DynastyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/dynasty")
public class DynastyController {
    @Autowired
    private DynastyService dynastyService;
    @GetMapping(value = "/dynastyList" )
    public ResponseEntity SelectDynasty(@RequestParam(name = "query", required = false) String DynastyName,
             @RequestParam(name = "pagenum",required = false,defaultValue = "1") Integer pageNum,
             @RequestParam(name = "pagesize",required = false,defaultValue = "10") Integer pageSize){
        System.out.println("pageNum"+pageNum+"pageSize"+pageSize);
        PageInfo<Dynasty> pageInfo = dynastyService.SelectDynastyByName(DynastyName, pageNum, pageSize);
        JSONObject resp = new JSONObject().fluentPut("total", pageInfo.getTotal());
        resp.put("poems", pageInfo.getList());
        System.out.println("total的值"+pageInfo.getTotal());
        return new ResponseEntity<>(ResultBean.ok(ResultConst.GET_MANAGERS_SUCC, resp), HttpStatus.OK);
    }
}
