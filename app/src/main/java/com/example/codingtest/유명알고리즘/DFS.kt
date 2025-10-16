package com.example.codingtest.유명알고리즘

fun main(){
    val n = 5
    val graph = Array(n + 1) { mutableListOf<Int>() }

    // 예시 그래프 (무방향)
    graph[1].addAll(listOf(2, 3))
    graph[2].addAll(listOf(1, 4, 5))
    graph[3].addAll(listOf(1))
    graph[4].addAll(listOf(2))
    graph[5].addAll(listOf(2))

    println(graph.contentToString())

    val visited = BooleanArray(n + 1)
    dfs(graph, visited, 1) // 1번 노드에서 시작
}

fun dfs(graph: Array<MutableList<Int>>, visited: BooleanArray, v: Int) {
    visited[v] = true
    println("방문: $v")

    for (next in graph[v]) {
        if (!visited[next]) {
            dfs(graph, visited, next)
        }
    }
}