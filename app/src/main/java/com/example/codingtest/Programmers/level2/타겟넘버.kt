package com.example.codingtest.Programmers.level2

fun main(){
    val numbers = intArrayOf(1, 1, 1, 1, 1)
    val target = 3
    var answer = 0

    fun dfs(index: Int, currentSum: Int) {
       if( index == numbers.size){
           if(currentSum == target){
               answer++
           }
           return
       }

        dfs(index + 1, currentSum + numbers[index])
        dfs(index + 1, currentSum - numbers[index])
    }

    dfs(0, 0)
    println(answer)
}