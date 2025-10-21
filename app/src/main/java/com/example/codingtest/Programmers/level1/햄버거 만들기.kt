package com.example.codingtest.Programmers.level1

fun main(){
    val ingredient = intArrayOf(2,1,1,2,3,1,2,3,1)
    val stack = mutableListOf<Int>()
    var answer = 0

    for( i in ingredient) {
        stack.add(i)
        if (stack.size >= 4 &&
            stack[stack.lastIndex] == 1 &&
            stack[stack.lastIndex - 1] == 3 &&
            stack[stack.lastIndex - 2] == 2 &&
            stack[stack.lastIndex - 3] == 1
        ){
            repeat(4){
                stack.removeLast()
            }
            answer++
        }
    }

    println(answer)
}