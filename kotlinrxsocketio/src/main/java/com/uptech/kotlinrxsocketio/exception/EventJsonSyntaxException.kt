package com.uptech.kotlinrxsocketio.exception

import java.lang.RuntimeException

/**
 * Exception for JSON parsing while sending/receiving data via socket.
 *
 * @author Andrii Chernysh. E-mail: itcherry97@gmail.com
 */
class EventJsonSyntaxException(val eventName: String, jsonSyntaxExceptionMessage: String?):
        RuntimeException("Json syntax exception occurred in socket event $eventName." +
                " Message: ${jsonSyntaxExceptionMessage ?: "No message"}")