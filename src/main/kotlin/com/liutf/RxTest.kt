package com.liutf

import rx.Observable
import java.io.File
import java.util.concurrent.Executors

/**
 * FileName: RxTest
 * Description:
 * Version: v1.0.0
 * Author: liutf
 * Date: 2017/5/21
 */

fun main(args: Array<String>) {
    val text = File(ClassLoader.getSystemResource("input").path).readText()
    println(text)

    Observable
            .from(text.toCharArray().asIterable())
            .filter { !it.isWhitespace() }
            .groupBy { it }
            .map {
                x -> x.count().subscribe {
                println("${x.key} -- $it")
            }
        }.subscribe()

    val threadPool = Executors.newCachedThreadPool()
    threadPool.execute{
        print("aaa")
    }
}