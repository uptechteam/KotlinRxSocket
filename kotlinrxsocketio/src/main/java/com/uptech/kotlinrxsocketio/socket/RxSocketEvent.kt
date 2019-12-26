package com.uptech.kotlinrxsocketio.socket

/**
 * Enum that contains all possible system socket events
 *
 * @author Andrii Chernysh. E-mail: itcherry97@gmail.com
 */
enum class RxSocketEvent {
    CONNECTED,
    CONNECTING,
    CONNECT_ERROR,
    CONNECT_TIMEOUT,
    DISCONNECTED,
    ERROR,
    MESSAGE,
    PING,
    PONG,
    RECONNECTED,
    RECONNECTING,
    RECONNECT_ATTEMPT,
    RECONNECT_ERROR,
    RECONNECT_FAILED,
    SEND_DATA_ERROR
}