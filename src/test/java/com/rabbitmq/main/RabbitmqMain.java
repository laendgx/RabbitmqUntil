package com.rabbitmq.main;

import com.rabbitmqUntil.RabbitmqUtil;
import org.junit.Test;

public class RabbitmqMain {

    public static void main(String[] args) {
        RabbitmqUtil rabbitmqUtil = new RabbitmqUtil();
        rabbitmqUtil.send("Hello RabbitMQ");
        rabbitmqUtil.receive();
    }


    /**
    * 发送测试
    */
    @Test
    public void  queueSendTest(){
        RabbitmqUtil rabbitmqUtil = new RabbitmqUtil();
        rabbitmqUtil.send("Hello RabbitMQ");
        rabbitmqUtil.receive();
       }

}
