package com.poem.interceptor;


import com.alibaba.fastjson.JSONObject;
import com.poem.dto.base.ResultBean;
import com.poem.dto.base.ResultConst;
import com.poem.util.JwtUtil;
import org.springframework.http.HttpStatus;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CommonInterceptor extends HandlerInterceptorAdapter {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("进入Controller前");
        String url = request.getRequestURI();
        if(url.indexOf("/login") >= 0 || url.indexOf("/register") >= 0) {
            return true;
        }else{
            //4.获取当前的所有请求头信息
            String jwtToken = request.getHeader("Authorization");
            //6.判断当前令牌是否存在, 如果不存在,则向客户端返回错误提示信息
            if (StringUtils.isEmpty(jwtToken)) {
                ResultBean error = ResultBean.error(HttpStatus.FORBIDDEN.value(), ResultConst.INVALID_TOKEN);
                response.setContentType("application/json;charset=UTF-8");
                response.getWriter().print(JSONObject.toJSON(error));
                return false;
            }

            //6.1 如果令牌存在,解析jwt令牌,判断该令牌是否合法,如果令牌不合法,则向客户端返回错误提示信息
            try {
                JwtUtil.parseJWT(jwtToken);
            } catch (Exception e) {
                e.printStackTrace();
                ResultBean error = ResultBean.error(HttpStatus.FORBIDDEN.value(), ResultConst.INVALID_TOKEN);
                response.setContentType("application/json;charset=UTF-8");
                response.getWriter().print(JSONObject.toJSON(error));
                return false;
            }
        }
        return true;
    }
}
