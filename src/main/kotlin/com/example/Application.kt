package com.example
import arrow.core.Either

import io.ktor.server.engine.*
import io.ktor.server.netty.*
import com.example.plugins.*

// test
fun main() {
    embeddedServer(Netty, port = 8080, host = "0.0.0.0") {
        configureRouting()
        configureHTTP()
        configureSockets()
        configureSerialization()
    }.start(wait = true)
}
