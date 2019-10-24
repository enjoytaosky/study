/*
package com.example.study.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

*/
/**
 * @author: taotao
 * @date: 2019/10/24 09:50
 * @description:
 *//*

@Configuration
@Slf4j
public class SessionConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new SecurityInterceptor())
                .excludePathPatterns("/user/login")
                //拦截路径
                .addPathPatterns("/**");
    }

    @Configuration
    private class SecurityInterceptor implements HandlerInterceptor {

        @Override
        public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
            HttpSession session = request.getSession();
            if (session.getAttribute(session.getId()) != null) {
                return true;
            }
            response.getWriter().write("please login");
            return false;
        }
    }
}
*/
