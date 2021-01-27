package com.example.jxau.redistest.test;

import lombok.extern.slf4j.Slf4j;
import org.springframework.data.redis.connection.Message;
import org.springframework.data.redis.listener.KeyExpirationEventMessageListener;
import org.springframework.data.redis.listener.RedisMessageListenerContainer;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class RedisKeyExpirationListener extends KeyExpirationEventMessageListener {


    public RedisKeyExpirationListener(RedisMessageListenerContainer listenerContainer) {
        super(listenerContainer);
    }

    //    @Resource
//    SeatService seatService;
    @Override
    public void onMessage(Message message, byte[] pattern) {
        String expiredKey = message.toString();
        if (expiredKey.equals("keyTest")) {
            log.info(expiredKey + "----redis存储key过期,动作触发,释放座位");
//            seatService.updateToFreeSeat("1");
        }
        try {
            //业务处理
        } catch (Exception e) {
            log.error("key 过期通知处理异常，{}", e);
        }

    }

}

