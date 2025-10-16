package com.example.codingtest.Programmers.level2

fun main(){
    val clothes = arrayOf(
        arrayOf("yellow_hat", "headgear"),
        arrayOf("blue_sunglasses", "eyewear"),
        arrayOf("green_turban", "headgear")
    )

    val clothesMap = mutableMapOf<String, Int>()

    for (clothe in clothes) {
        val type = clothe[1]
        clothesMap[type] = clothesMap.getOrDefault(type, 0) + 1
    }

    var answer = 1

    for (count in clothesMap.values) {
        answer *= (count + 1)
    }
    answer -= 1 // 아무것도 안 입는 경우 제외

    println(answer)
}