package com.example.codingtest.Programmers.level1

fun main(){
    var X = "100"
    var Y = "123450"
    var answer = ""

    val asd = mutableListOf<Int>()
    var Ycopy = Y

    for (i in X){
        if(Ycopy.contains(i)){
            asd.add(i.digitToInt())
            Ycopy = Ycopy.replaceFirst(i,' ')
        }
    }

    if(asd.isEmpty()){
        answer = "-1"
    } else if (asd.all { it == 0}){
        answer = "0"
    }else {
        for( i in asd.sortedDescending()){
            answer += i
        }
    }

    println(answer)


}