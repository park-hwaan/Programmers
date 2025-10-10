package com.example.codingtest.Programmers.level1

fun main() {
    val s = "foobar"
    val answer = IntArray(s.length) { -1 }
    val charMap = mutableMapOf<Char, Int>()


    for (index in s.indices) {
        val c = s[index]
        if (charMap.containsKey(c)) {
            answer[index] = index - charMap[c]!!
            charMap[c] = index
        } else {
            answer[index] = -1
            charMap[c] = index
        }
    }

}