package com.example.codingtest.Programmers.level1

fun main(){
    val N = 5
    val stages = intArrayOf(2,1,2,6,2,4,3,3)
    var answer = intArrayOf()

    var stageMap = mutableMapOf<Int, Int>()

    for(i in stages.indices){
        if(!stageMap.containsKey(stages[i])){
            stageMap[stages[i]] = 1
        } else {
            stageMap[stages[i]] = stageMap[stages[i]]!! + 1
        }
    }

    println(stageMap)


}