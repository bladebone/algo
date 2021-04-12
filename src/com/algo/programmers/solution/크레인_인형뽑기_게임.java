package com.algo.programmers.solution;

import java.util.Stack;

// 2019 카카오 개발자 겨울 인턴십
public class 크레인_인형뽑기_게임 {

    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> basket = new Stack<>();
        for (int move : moves) {
            int row = move - 1;
            int pointer = 0;
            for (int j = 0; j < board[0].length; j++) {
                if (board[j][row] == 0) {
                    continue;
                }
                pointer = board[j][row];
                board[j][row] = 0;
                break;
            }
            if (pointer == 0) {
                continue;
            }
            if (!basket.empty() && pointer == basket.peek()) {
                basket.pop();
                answer++;
                continue;
            }
            basket.push(pointer);
        }
        return answer * 2;
    }
}
