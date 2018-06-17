package com.nepxion.aquarius.idgenerator.redis.config;

/**
 * <p>Title: Nepxion Aquarius</p>
 * <p>Description: Nepxion Aquarius</p>
 * <p>Copyright: Copyright (c) 2017-2050</p>
 * <p>Company: Nepxion</p>
 * @author Haojun Ren
 * @version 1.0
 */

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.nepxion.aquarius.common.redis.handler.RedisHandler;
import com.nepxion.aquarius.common.redis.handler.RedisHandlerImpl;
import com.nepxion.aquarius.idgenerator.redis.RedisIdGenerator;
import com.nepxion.aquarius.idgenerator.redis.impl.RedisIdGeneratorImpl;

@Configuration
public class RedisIdGeneratorConfig {
    @Bean
    public RedisIdGenerator redisIdGenerator() {
        return new RedisIdGeneratorImpl();
    }

    @Bean
    public RedisHandler redisHandler() {
        return new RedisHandlerImpl();
    }
}