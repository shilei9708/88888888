package com.atguigu.redis;

import redis.clients.jedis.Jedis;

/**
 * @author MingYue
 * @create 2020-10-27 15:34
 */
public class test1 {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("hadoop102", 6379);
        System.out.println(jedis.get("abc"));
        System.out.println("this is master");
        System.out.println("123");

        System.out.println("999");

        jedis.close();
    }
}
