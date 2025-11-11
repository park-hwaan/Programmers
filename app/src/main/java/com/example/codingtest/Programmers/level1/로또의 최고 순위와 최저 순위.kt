package com.example.codingtest.Programmers.level1

fun main(){
    val lottos = intArrayOf(44, 1, 0, 0, 31, 25)
    val win_nums = intArrayOf(31, 10, 45, 1, 6, 19)

    var answer: IntArray = intArrayOf(0,0)

    var sameNum = 0
    var countZero = 0

    for(i in lottos){
        if(i == 0){
            countZero++
        }
        if (i in win_nums){
            sameNum++
        }
    }

    answer[0] = when(sameNum + countZero){
        6 -> 1
        5 -> 2
        4 -> 3
        3 -> 4
        2 -> 5
        else -> 6
    }

    if(answer[0] == 6){
        answer[1] = 6
    }else {
        answer[1] = sameNum
    }

}