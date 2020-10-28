package com.atguigu.redis;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

/**
 * @author MingYue
 * @create 2020-10-27 15:39
 */
public class test2 {
    public static void main(String[] args) {
        JedisPool pool = new JedisPool("hadoop102", 6379);
        Jedis jedis = pool.getResource();
        System.out.println(jedis.get("abc"));
        System.out.println("this is master");
        pool.close();
    }
}
