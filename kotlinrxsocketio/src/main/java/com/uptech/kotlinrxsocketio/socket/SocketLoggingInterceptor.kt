package com.uptech.kotlinrxsocketio.socket



/**
 * Interceptor for logging socket events
 *
 * @author Andrii Chernysh. E-mail: itcherry97@gmail.com
 */
interface SocketLoggingInterceptor {
    fun logInfo(message: String)
    fun logError(message: String)
}