package com.cloud.elasticsearchspringbootstarter.config;

import com.cloud.elasticsearchspringbootstarter.service.Md5Service;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author 成都犀牛
 * @version version 1.0
 * @date 2020/12/10 14:42
 */
@Configuration
public class Md5AutoConfiguration {

    @Bean
    public Md5Service md5Service(){
        return new Md5Service();
    }
}
