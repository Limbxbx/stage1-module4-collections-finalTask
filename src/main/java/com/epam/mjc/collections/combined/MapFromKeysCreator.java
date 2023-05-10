package com.epam.mjc.collections.combined;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapFromKeysCreator {
    public Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap) {
        Map<Integer, Set<String>> resultMap = new HashMap<>();

        for(String key : sourceMap.keySet()) {
           int /*3*/keyLength = key.length();
           Set<String> keysSet = resultMap.getOrDefault(keyLength, new HashSet<>());
           keysSet.add(key);
           resultMap.put(keyLength, keysSet);
        }

        return null;
    }
}
