package com.demo.zuul.gateway.config;

import org.springframework.cloud.netflix.zuul.filters.discovery.PatternServiceRouteMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * MyConfig
 * 配置自定义路由-----(和yml一样的)
 * @author 10905 2019/2/7
 * @version 1.0
 */
@Configuration
public class MyConfig {
    /**
     * 访问网关的 /module/**，将会被路由到 zuul-sale-service 服务进行处理
     */
    @Bean
    public PatternServiceRouteMapper patternServiceRouteMapper() {
        return new PatternServiceRouteMapper(
                "(zuul)-(?<sale>.+)-(service)", "${sale}/**");
    }
}
