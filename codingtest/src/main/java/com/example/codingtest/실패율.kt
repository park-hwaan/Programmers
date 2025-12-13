package com.example.codingtest

fun main(){
    val N = 4
    val stages = intArrayOf(4,4,4,4,4)
    var remainUser = stages.size
    var answer = intArrayOf()

    var stageMap = sortedMapOf<Int, Int>()
    val failRateList = mutableListOf<Pair<Int, Double>>()

    for(i in stages.indices){
        if(!stageMap.containsKey(stages[i])){
            stageMap[stages[i]] = 1
        } else {
            stageMap[stages[i]] = stageMap[stages[i]]!! + 1
        }
    }

    for (stage in 1..N) {
        val failUser = stageMap[stage] ?: 0

        val failRate =
            if (remainUser == 0) 0.0
            else failUser.toDouble() / remainUser

        failRateList.add(stage to failRate)

        remainUser -= failUser
    }

    val sorted = failRateList.sortedWith(compareByDescending<Pair<Int, Double>> { it.second }.thenBy { it.first })

    for (i in sorted.indices){
      answer = answer.plus(sorted[i].first)
    }

}