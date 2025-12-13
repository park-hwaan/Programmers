package com.example.codingtest.level1

fun main(){
    val k = 3  //사과의 최대 점수
    val m = 4 //한 상자에 들어가는 사과의 수
    var score = intArrayOf(1, 2, 3, 1, 2, 3, 1)
    var boxNum = score.size / m
    var answer = 0

    var newScore = score.sortedArrayDescending()
    println(newScore.contentToString())


    for(i in 1..boxNum){
        answer += newScore[i*m - 1] * m
    }

    println(answer)



}