package com.example.codingtest.level2

fun main(){
    val want = arrayListOf<String>("banana", "apple", "rice", "pork", "pot")
    val number = intArrayOf(3, 2, 2, 2, 1)
    val discount = arrayListOf<String>(
        "chicken", "apple", "apple", "banana", "rice", "apple", "pork", "banana", "pork", "rice", "pot", "banana", "apple", "banana"
    )
    var answer = 0
    val cnt = number.sum()

    val wantMap = want.zip(number.toList()).toMap().toMutableMap()

    for (i in 0..discount.size - cnt){
        val tempMap = HashMap(wantMap)

        for (j in i until i + 10){
            if(tempMap.containsKey(discount[j])){
                tempMap[discount[j]] = tempMap[discount[j]]!! - 1
            }
        }
        if(tempMap.values.all { it == 0 }) answer++
    }

    println(answer)


}