package com.amolina.data.model.api

import com.amolina.data.BuildConfig.API_KEY
import com.amolina.data.BuildConfig.API_METHOD
import okhttp3.Interceptor
import javax.xml.transform.OutputKeys.METHOD

class HttpInterceptor() : Interceptor {
    override fun intercept(chain: Interceptor.Chain): okhttp3.Response {
        var request = chain.request()

       val url = request.url.newBuilder()
            .addEncodedQueryParameter("api?%20key", API_KEY)
            .addEncodedQueryParameter("method", API_METHOD)
            .build()
        request = request.newBuilder().url(url).build()
        return chain.proceed(request)
    }
}
//  http://api.lafourchette.com/api?%20key=IPHONEPRODEDCRFV&method=restaurant_get_info&id_restaurant=6861