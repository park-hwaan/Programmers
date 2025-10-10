package com.example.codingtest.Programmers.level1

// 체크 리스트
//1.공원 세로, 가로를 넘지 않는지
//2.장애물이 있는지
fun main() {
    val park = arrayOf("SOO","OOO","OOO")
    val routes = arrayOf("E 2")

    var answer: IntArray = intArrayOf(0,0)

    var rowSize = park.size // 세로 크기
    var colSize = park[0].length // 가로 크기

    val directionsList = mutableListOf<String>() // 경로 리스트
    val moveList = mutableListOf<Int>()      // 이동 거리 리스트

    answer[1] = park[0].indexOf('S') // 시작점

    for (route in routes) {
        val parts = route.split(" ")
        if (parts.size == 2) {
            directionsList.add(parts[0])
            moveList.add(parts[1].toInt())
        }
    }

    var x = 0
    var y = park[0].indexOf('S') // 시작 위치

    val dirMap = mapOf(
        "E" to Pair(0, 1),
        "W" to Pair(0, -1),
        "S" to Pair(1, 0),
        "N" to Pair(-1, 0)
    )

    for (i in routes.indices) {
        val (dx, dy) = dirMap[directionsList[i]]!!
        val move = moveList[i]

        var tempX = x
        var tempY = y
        var canMove = true

        repeat(move) {
            tempX += dx
            tempY += dy
            if (tempX !in park.indices || tempY !in park[0].indices || park[tempX][tempY] == 'X') {
                canMove = false
                return@repeat
            }
        }

        if (canMove) {
            x = tempX
            y = tempY
        }
    }
    println()

}
