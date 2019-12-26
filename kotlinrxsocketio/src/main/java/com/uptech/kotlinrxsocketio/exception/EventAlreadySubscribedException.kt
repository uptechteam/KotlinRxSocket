package com.uptech.kotlinrxsocketio.exception

import java.lang.RuntimeException

/**
 * Exception for throwing when developer subscribed
 * to some event two times in a row.
 * There will be subscription duplicate in such case
 *
 * @author Andrii Chernysh. E-mail: itcherry97@gmail.com
 */
class EventAlreadySubscribedException(eventName: String):
        RuntimeException("Socket already subscribed to the event $eventName. Don\'t duplicate subscriptions")