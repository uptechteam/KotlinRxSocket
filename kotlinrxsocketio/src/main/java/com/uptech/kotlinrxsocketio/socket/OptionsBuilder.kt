package com.uptech.kotlinrxsocketio.socket

import io.socket.client.IO

/**
 * Builder for IO.Options for creating pretty DSL
 *
 * @author Andrii Chernysh. E-mail: itcherry97@gmail.com
 */
class OptionsBuilder {
  var forceNew: Boolean = false

  var query: String = ""

  var reconnection: Boolean = true
  var reconnectionAttempts: Int = 0
  var reconnectionDelay: Long = 1000L
  var reconnectionDelayMax: Long = 5000L
  var timeout: Long = 20000L
  var randomizationFactor = 0.5

  fun build(): IO.Options {
    val options = IO.Options()
    options.forceNew = forceNew
    options.query = query
    options.reconnection = reconnection
    options.reconnectionAttempts = reconnectionAttempts
    options.reconnectionDelay = reconnectionDelay
    options.reconnectionDelayMax = reconnectionDelayMax
    options.timeout = timeout
    options.randomizationFactor = randomizationFactor

    return options
  }
}