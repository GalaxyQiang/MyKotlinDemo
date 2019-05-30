package com.john.history.mykotlindemo.test.okhttp

import android.R.string
import android.R.attr.name
import okhttp3.*
import org.junit.experimental.results.ResultMatchers.isSuccessful
import java.io.IOException


private val client = OkHttpClient()

@Throws(Exception::class)
fun main() {
    val request = Request.Builder()
        .url("http://publicobject.com/helloworld.txt")
        .build()

    client.newCall(request).enqueue(object : Callback {

        override fun onFailure(call: Call, e: IOException) {
            e.printStackTrace()
        }

        @Throws(IOException::class)
        override fun onResponse(call: Call, response: Response) {
            response.body().use { responseBody ->
                if (!response.isSuccessful) throw IOException("Unexpected code $response")

                val responseHeaders = response.headers()
                var i = 0
                val size = responseHeaders.size()
                while (i < size) {
                    println(responseHeaders.name(i) + ": " + responseHeaders.value(i))
                    i++
                }

                println(responseBody?.string())
            }
        }
    })
}