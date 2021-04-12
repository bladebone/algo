package com.algo.programmers.solution;

import java.util.HashMap;

// 해시
public class 완주하지_못한_선수 {

    public String solution(String[] participant, String[] completion) {

        HashMap<Integer, Integer> map = new HashMap<>();
        for (String s : completion) {
            final int hashCode = s.hashCode();
            map.put(hashCode, map.getOrDefault(hashCode, 0) + 1);
        }
        for (String s : participant) {
            int pHash = s.hashCode();
            Integer cHash = map.get(pHash);
            if (null != cHash && 0 < cHash) {
                map.replace(pHash, cHash - 1);
                continue;
            }
            return s;
        }
        return "";
    }
}
