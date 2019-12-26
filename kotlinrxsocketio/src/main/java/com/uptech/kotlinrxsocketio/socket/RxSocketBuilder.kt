package com.uptech.kotlinrxsocketio.socket

import com.google.gson.Gson
import io.socket.client.IO

/**
 * Builder for RxSocket for creating pretty DSL
 *
 * @author Andrii Chernysh. E-mail: itcherry97@gmail.com
 */
class RxSocketBuilder{
    var hostIp: String = "PLEASE_SET_HOST_IP_AND_PORT"
    var port: Int = 0
    var namespace: String = ""
    var options: IO.Options? = null
    var gson: Gson = Gson()
    var socketLoggingInterceptor: SocketLoggingInterceptor? = null

    fun options(block: OptionsBuilder.() -> Unit) {
        options = OptionsBuilder().apply(block).build()
    }

    fun build() = RxSocket(hostIp, port, namespace, options, gson, socketLoggingInterceptor)
}