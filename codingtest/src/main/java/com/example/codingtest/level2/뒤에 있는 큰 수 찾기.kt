package com.example.codingtest.level2

fun main() {
    val numbers = intArrayOf(9, 1, 5, 3, 6, 2)
    val answer = IntArray(numbers.size) { -1 }

    for (i in numbers.indices) {
        var sum = i + 1

        while (true) {
            // ★ 배열 범위 벗어나면 종료
            if (sum >= numbers.size) {
                answer[i] = -1
                break
            }

            // ★ 더 큰 수 찾음
            if (numbers[i] < numbers[sum]) {
                answer[i] = numbers[sum]
                break
            }

            sum++
        }
    }

    println(answer.toList())
}
