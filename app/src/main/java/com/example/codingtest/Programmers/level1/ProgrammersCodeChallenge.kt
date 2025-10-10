package com.example.codingtest.Programmers.level1

/*
n = 택배 상자 수
w = 상자를 가로로 쌓는 수
num = 꺼내려는 상자 번호
 */

// 택배상자꺼내기
class ProgrammersCodeChallenge {

    fun solution(n: Int, w: Int, num: Int): Int {

        if (num < 1 || num > n) return 0

        val totalRow =  if(n % w ==0){ n / w } else (n / w) + 1 //10
        val currentNumRow = if( num % w == 0){ num / w } else (num / w) + 1 //2

        var answer = totalRow - currentNumRow + 1

        // 마지막 줄 예외 처리
        val lastRowBoxes = if (n % w == 0) w else n % w

        val positionInRow = if (num % w == 0) w else num % w

        if (currentNumRow == totalRow && positionInRow > lastRowBoxes) {
            answer--
        }

        return answer
    }
}