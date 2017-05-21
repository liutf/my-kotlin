package com.liutf

/**
 * FileName: KotlinTest
 * Description:
 * Version: v1.0.0
 * Author: liutf
 * Date: 2017/5/21
 */

fun main(args: Array<String>) {

    args.map {
        println(it)
    }

    args.map(::println)

    args.flatMap {
        it.split("_")
    }.map { println(it + "${it.length}") }

//    val (id, name, email) = UserInfo(1, "liutf", null)
//    println(id)
//    println(name)
//    println(email)
//
////    val bookInfo = BookInfo( 1, null, null)
////    println(bookInfo)
//
//
//    UserInfo::class.constructors.map(::println)
//    UserInfo::class.constructors.map { println() }
//    println(UserInfo::class.declaredMemberProperties)

}