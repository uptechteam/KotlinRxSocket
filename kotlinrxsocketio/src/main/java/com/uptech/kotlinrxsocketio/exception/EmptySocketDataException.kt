package com.uptech.kotlinrxsocketio.exception

import java.lang.RuntimeException

/**
 * Exception for throwing when sending/receiving data via socket is empty or null
 *
 * @author Andrii Chernysh. E-mail: itcherry97@gmail.com
 */
class EmptySocketDataException(eventName: String) :
        RuntimeException("You received NULL from socket event $eventName")