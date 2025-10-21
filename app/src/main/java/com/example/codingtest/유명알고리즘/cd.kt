package com.example.codingtest.유명알고리즘

import android.os.Build
import androidx.annotation.RequiresApi

@RequiresApi(Build.VERSION_CODES.VANILLA_ICE_CREAM)
fun main(){
    println(getPath(arrayOf("cd /", "cd a", "cd b", "cd ..", "cd c")))
}

@RequiresApi(Build.VERSION_CODES.VANILLA_ICE_CREAM)
fun getPath(commands: Array<String>): String {
    val stack = mutableListOf<String>()

    for (cmd in commands) {
        when {
            cmd == "cd /" -> stack.clear()
            cmd == "cd ." -> {} // 아무것도 안 함
            cmd == "cd .." -> if (stack.isNotEmpty()) stack.removeLast()
            cmd.startsWith("cd ") -> {
                val folder = cmd.substring(3)
                stack.add(folder)
            }
        }
    }

    return "/" + stack.joinToString("/")
}
