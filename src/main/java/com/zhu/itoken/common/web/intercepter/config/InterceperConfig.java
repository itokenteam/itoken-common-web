package com.zhu.itoken.common.web.intercepter.config;

import com.zhu.itoken.common.web.intercepter.ConstansIntercepter;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class InterceperConfig implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new ConstansIntercepter()).addPathPatterns("/**");
    }
}
