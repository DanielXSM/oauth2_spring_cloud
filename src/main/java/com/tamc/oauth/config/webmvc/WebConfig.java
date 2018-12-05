package com.tamc.oauth.config.webmvc;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

/**
 * Created by 赵东平 on 2018/11/30.
 */
@Configuration
public class WebConfig extends WebMvcConfigurationSupport {


    @Override
    protected void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/sh/static/**").addResourceLocations("classpath:/static/");
        super.addResourceHandlers(registry);
    }
}
