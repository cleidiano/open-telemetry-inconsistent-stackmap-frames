package com.example.plugins

import io.ktor.server.application.Application
import io.ktor.server.application.call
import io.ktor.server.response.respondText
import io.ktor.server.routing.get
import io.ktor.server.routing.routing

fun Application.configureRouting() {
    routing {
        get("/") {
            val classDefaultConstructorArguments =
                ClazzWithDefaultConstructorArguments() // <-------- java.lang.VerifyError: Inconsistent stackmap frames at branch target...

            call.respondText(classDefaultConstructorArguments.sayHello())
        }
    }
}
