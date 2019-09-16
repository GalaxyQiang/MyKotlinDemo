package com.john.history.mykotlindemo.test.coroutine

//import com.john.history.mykotlindemo.test.okhttp.client
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import okhttp3.*
import java.io.IOException
import kotlin.coroutines.resume
import kotlin.coroutines.suspendCoroutine

private val client = OkHttpClient()

suspend fun Call.wait()= suspendCoroutine<String>{
        cont->
    run {
        enqueue(object : Callback {
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
                    var xxx = responseBody?.string()
                    println(xxx)
                    if (xxx != null) {
                        cont.resume(xxx)
                    }
                }
            }
        })
    }
}
fun main() {

    val request = Request.Builder()
        .url("http://publicobject.com/helloworld.txt")
        .build()
    GlobalScope.launch {
        var aaa=client.newCall(request).wait()
        println(aaa)
    }
    Thread.sleep(10000)


//    client.newCall(request).enqueue(object : Callback {
//
//        override fun onFailure(call: Call, e: IOException) {
//            e.printStackTrace()
//        }
//
//        @Throws(IOException::class)
//        override fun onResponse(call: Call, response: Response) {
//            response.body().use { responseBody ->
//                if (!response.isSuccessful) throw IOException("Unexpected code $response")
//
//                val responseHeaders = response.headers()
//                var i = 0
//                val size = responseHeaders.size()
//                while (i < size) {
//                    println(responseHeaders.name(i) + ": " + responseHeaders.value(i))
//                    i++
//                }
//                println(responseBody?.string())
//            }
//        }
//    })


}