package com.nepxion.aquarius.lock.redis.config;

/**
 * <p>Title: Nepxion Aquarius</p>
 * <p>Description: Nepxion Aquarius</p>
 * <p>Copyright: Copyright (c) 2017-2050</p>
 * <p>Company: Nepxion</p>
 * @author Haojun Ren
 * @version 1.0
 */

import org.redisson.api.RLock;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

import com.nepxion.aquarius.common.redisson.handler.RedissonHandler;
import com.nepxion.aquarius.common.redisson.handler.RedissonHandlerImpl;
import com.nepxion.aquarius.lock.LockDelegate;
import com.nepxion.aquarius.lock.LockExecutor;
import com.nepxion.aquarius.lock.redis.condition.RedisLockCondition;
import com.nepxion.aquarius.lock.redis.impl.RedisLockDelegateImpl;
import com.nepxion.aquarius.lock.redis.impl.RedisLockExecutorImpl;

@Configuration
public class RedisLockConfig {
    @Bean
    @Conditional(RedisLockCondition.class)
    public LockDelegate redisLockDelegate() {
        return new RedisLockDelegateImpl();
    }

    @Bean
    @Conditional(RedisLockCondition.class)
    public LockExecutor<RLock> redisLockExecutor() {
        return new RedisLockExecutorImpl();
    }

    @Bean
    @Conditional(RedisLockCondition.class)
    public RedissonHandler redissonHandler() {
        return new RedissonHandlerImpl();
    }
}