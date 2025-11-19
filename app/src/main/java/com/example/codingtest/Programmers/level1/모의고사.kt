package com.example.codingtest.Programmers.level1

fun main() {
    val patterns = listOf(
        intArrayOf(1,2,3,4,5),
        intArrayOf(2,1,2,3,2,4,2,5),
        intArrayOf(3,3,1,1,2,2,4,4,5,5)
    )

    val answers = intArrayOf(1, 2, 3, 4, 5)
    var scores = IntArray(3)

    for (i in answers.indices) {
        for (j in patterns.indices) {
            if (answers[i] == patterns[j][i % patterns[j].size]) {
                scores[j]++
            }
        }
    }

    scores = scores.sorted().toIntArray()


}
