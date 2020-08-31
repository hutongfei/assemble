package com.my.map;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentDemo {

    public static void main(String[] args) {
        Map<String, Object> concurrentMap = new ConcurrentHashMap<>();

        concurrentMap.put("k", "v");
    }
}
