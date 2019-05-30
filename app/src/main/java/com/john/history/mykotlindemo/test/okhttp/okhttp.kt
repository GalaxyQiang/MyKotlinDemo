package com.john.history.mykotlindemo.test.okhttp

import okhttp3.OkHttpClient
import okhttp3.Request
import java.io.IOException


private val client = OkHttpClient()

@Throws(Exception::class)
fun main() {
    val request = Request.Builder()
        .url("https://www.baidu.com")
        .build()

    client.newCall(request).execute().use { response ->
        if (!response.isSuccessful) throw IOException("Unexpected code $response")

        val responseHeaders = response.headers()
        for (i in 0 until responseHeaders.size()) {
            println(responseHeaders.name(i) + ": " + responseHeaders.value(i))
        }

        System.out.println(response.body()?.string())
    }
}