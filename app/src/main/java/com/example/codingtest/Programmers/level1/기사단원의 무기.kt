package com.example.codingtest.Programmers.level1

// 일반적으로 풀기보단 for문에서 limit을 넘어가면 해당 for문은 종료
//숫자 전체를 for로 돌리기보다는 제곱근을 구해서 계산수를 줄이는게 좋음
fun main(){
    val number = 10
    val limit = 3
    val power = 2
    var answer = 0

    for (num in 1..number){
        var count = 0
        val sqrt = kotlin.math.sqrt(num.toDouble()).toInt()

        for(i in 1..sqrt){
            if (num % i == 0) {
                count += if (i * i == num) 1 else 2
            }
            if(count > limit) break
        }
        if(count <= limit) answer += count else answer += power
    }

    println(answer)
}