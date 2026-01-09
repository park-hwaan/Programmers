package com.example.codingtest.level2

fun main(){
    val s = "3people unFollowed me"
    var asnwer = ""
    var ss = s.split(" ").toMutableList()
    for (i in ss.indices){
        ss[i] = ss[i].uppercase()
    }

    println(ss)
}