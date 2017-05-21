package com.liutf

/**
 * FileName: LangEnum
 * Description:
 * Version: v1.0.0
 * Author: liutf
 * Date: 2017/5/21
 */

enum class LangEnum(val hello : String){
    ENGLISH("Hello"),
    CHINESE("你好");

    fun sayHello(){
        println(hello)
    }

    companion object {
        fun parseLang(name: String): LangEnum {
            return valueOf(name.toUpperCase())
        }
    }
}

fun main(args: Array<String>) {
    if (args.isEmpty()){
        println("参数为空")
    }
    val lang = LangEnum.parseLang(args[0])
    println(lang)

    lang.sayHello()
    lang.sayBye()
}

fun LangEnum.sayBye(){
    val bye = when(this){
        LangEnum.ENGLISH -> "Bye"
        LangEnum.CHINESE -> "再见"
    }
    println(bye)
}
