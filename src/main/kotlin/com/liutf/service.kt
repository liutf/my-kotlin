package com.liutf

import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

/**
 * FileName: service
 * Description:
 * Version: v1.0.0
 * Author: liutf
 * Date: 2017/5/21
 */

interface GithubService{
    @GET("/v2/book/1220562")
    fun getStarGazers(): Call<List<BookInfo>>
}

object Service{
    val gitHubService : GithubService by lazy {
        Retrofit.Builder().baseUrl("https://api.douban.com")
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(gitHubService::class.java)
    }
}

fun main(args: Array<String>) {
    Service.gitHubService
            .getStarGazers()
            .execute()
            .body()?.map(::println)
}