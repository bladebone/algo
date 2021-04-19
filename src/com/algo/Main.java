package com.algo;

import com.algo.programmers.solution.완주하지_못한_선수;
import com.algo.programmers.solution.신규_아이디_추천;
import com.algo.programmers.solution.크레인_인형뽑기_게임;

public class Main {

    public static void main(String[] args) {

        String new_id = "...!@BaT#*..y.abcdefghijklm";
        System.out.println("from = " + new_id);
        final 신규_아이디_추천 s = new 신규_아이디_추천();
        s.solution(new_id);
        System.out.println("answer = " + s.solution(new_id));

//        String[] participant = new String[]{"mislav", "stanko", "mislav", "ana"};
//        String[] completion = new String[]{"stanko", "ana", "mislav"};
//        완주하지_못한_선수 s = new 완주하지_못한_선수();
//        System.out.println("answer = " + s.solution(participant, completion));

//        final int[][] board = new int[][]{{0, 0, 0, 0, 0}, {0, 0, 1, 0, 3}, {0, 2, 5, 0, 1}, {4, 2, 4, 4, 2}, {3, 5, 1, 3, 1}};
//        final int[] moves = new int[]{1, 5, 3, 5, 1, 2, 1, 4};
//        크레인_인형뽑기_게임 s = new 크레인_인형뽑기_게임();
//        System.out.println("answer = " + s.solution(board, moves));
    }
}
