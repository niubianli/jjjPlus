package com.sz.jjj.rxjavaretrofitdemo.service

import com.sz.jjj.rxjavaretrofitdemo.model.HttpResult
import com.sz.jjj.rxjavaretrofitdemo.model.Subjects
import retrofit2.http.GET
import retrofit2.http.Query
import rx.Observable


/**
 * Created by jjj on 2017/7/13.
@description:
 */
interface MovieService {
    @GET("top250")
    fun getTopMovie3(@Query("start") start: Int, @Query("count") count: Int): Observable<HttpResult<List<Subjects>>>
}