package com.algo.programmers.solution;

public class 신규_아이디_추천 {

    public String solution(String new_id) {

        String answer = "";

        // 1단계 new_id의 모든 대문자를 대응되는 소문자로 치환합니다.
        answer = toLowerCase(new_id);

        // 2단계 new_id에서 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 모든 문자를 제거합니다.
        answer = removeUnsupported(answer);
        
        // 3단계 new_id에서 마침표(.)가 2번 이상 연속된 부분을 하나의 마침표(.)로 치환합니다.
        answer = clearDuplicatedDot(answer);

        // 4단계 new_id에서 마침표(.)가 처음이나 끝에 위치한다면 제거합니다.
        answer = removeFirstDot(answer);
        answer = removeLastDot(answer);
        
        // 5단계 new_id가 빈 문자열이라면, new_id에 "a"를 대입합니다.
        answer = addAIfEmpty(answer);
        
        // 6단계 new_id의 길이가 16자 이상이면, new_id의 첫 15개의 문자를 제외한 나머지 문자들을 모두 제거합니다.
        //        만약 제거 후 마침표(.)가 new_id의 끝에 위치한다면 끝에 위치한 마침표(.) 문자를 제거합니다.
        answer = cutLength(answer);
        answer = removeLastDot(answer);
        
        // 7단계 new_id의 길이가 2자 이하라면, new_id의 마지막 문자를 new_id의 길이가 3이 될 때까지 반복해서 끝에 붙입니다.
        answer = addTillMinLength(answer);
        
        return answer;
    }

    private String addTillMinLength(String s) {
        if (s.length() >= 3) {
            return s;
        }
        return addTillMinLength(s.concat(s.substring(s.length() - 1)));
    }

    private String cutLength(String s) {
        return s.length() > 15 ? s.substring(0, 15) : s;
    }

    private String addAIfEmpty(String s) {
        return s.isEmpty() ? "a" : s;
    }

    private String removeLastDot(String s) {
        return s.endsWith(".") ? s.substring(0, s.length() - 1) : s;
    }

    private String removeFirstDot(String s) {
        return s.startsWith(".") ? s.substring(1) : s;
    }

    private String clearDuplicatedDot(String s) {
        return s.replaceAll("\\.{2,}", "\\.");
    }

    private String removeUnsupported(String s) {
        return s.replaceAll("[^a-z\\d\\-\\_\\.]*", "");
    }

    private String toLowerCase(String s) {
        return s.toLowerCase();
    }
}
