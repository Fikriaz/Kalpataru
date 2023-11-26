package com.slostyle.articles_page.Data

import com.slostyle.articles_page.NewsApiService
import com.slostyle.articles_page.utils.MyResponse
import com.slostyle.articles_page.utils.TOKEN
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.flow
import javax.inject.Inject
import com.slostyle.articles_page.Data.NewsResponse
//Ambil Api
class MainRepository @Inject constructor(private val api : NewsApiService)
{
    suspend fun lastNews() : Flow<MyResponse<NewsResponse>> = flow {
        emit(MyResponse.loading())
        val response = api.getTopHeadLines(TOKEN,"Pollution")
        if (response.isSuccessful)
            emit(MyResponse.success(response.body()))
        else emit(MyResponse.error("please try again later!"))
    }.catch {
        emit(MyResponse.error(it.message.toString()))
    }
}
