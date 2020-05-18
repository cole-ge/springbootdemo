package com.gzw.demo.config;

import com.gzw.demo.Interceptors.OneInterceptor;
import com.gzw.demo.Interceptors.TwoInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

/**
 * gezhiwang 20200516
 */
//使用@Configuration 表明当前类是一个配置类
@Configuration
public class WebMvcConfigurer extends WebMvcConfigurationSupport {

    @Override
    protected void addInterceptors(InterceptorRegistry registry) {
        //拦截器按照注册顺序进行拦截
        registry.addInterceptor(new OneInterceptor()).addPathPatterns("/one/**");
        registry.addInterceptor(new TwoInterceptor()).addPathPatterns("/one/**").addPathPatterns("/two/**");
        super.addInterceptors(registry);
    }
}
