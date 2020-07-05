package com.poem.controller;


import com.alibaba.fastjson.JSONObject;
import com.poem.dto.base.ResultBean;
import com.poem.dto.base.ResultConst;
import com.poem.exception.BussinessException;
import org.springframework.http.HttpRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
@Controller
@RequestMapping("/file")
public class FileController {
    /**
     * 实现文件上传
     * */
    @PostMapping("/upload")
    public ResponseEntity fileUpload(@RequestParam("file") MultipartFile file , HttpServletRequest request ){
        if(file.isEmpty()){
            throw new BussinessException(HttpStatus.BAD_REQUEST.value(), ResultConst.FILE_NOT_EMPTY);
        }
        String fileName = file.getOriginalFilename();
        String path = "/Users/mac/Downloads/poem-master/src/main/webapp/upload";
        File dest = new File(path + "/"+fileName);
        System.out.println(path);
        if(!dest.getParentFile().exists()){ //判断文件父目录是否存在
            dest.getParentFile().mkdir();
        }
        try {
            file.transferTo(dest); //保存文件
            JSONObject resp = new JSONObject().fluentPut("tmpPath", path + fileName);
            return new ResponseEntity<>(ResultBean.ok(ResultConst.UPLOAD_SUCC, resp), HttpStatus.OK);
        }catch (Exception e) {
            e.printStackTrace();
            throw new BussinessException(HttpStatus.BAD_REQUEST.value(), ResultConst.UPLOAD_FAIL);
        }

    }
}
