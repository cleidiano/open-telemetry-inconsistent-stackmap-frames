package com.example.plugins

import io.opentelemetry.instrumentation.annotations.WithSpan
import kotlinx.coroutines.delay

class ClazzWithDefaultConstructorArguments(val name: String = "Ktor") {

    @WithSpan
    suspend fun sayHello(): String {
        delay(10)
        return "Hello World $name from ${WithoutDefaultConstructorArguments::class.simpleName}!"
    }
}

class WithoutDefaultConstructorArguments(val name: String) {

    @WithSpan
    suspend fun sayHello(): String {
        delay(10)
        return "Hello World from ${WithoutDefaultConstructorArguments::class.simpleName}!"
    }
}

class Greeting {

    @WithSpan
    suspend fun sayHello(): String {
        delay(10)
        return "Hello World from ${Greeting::class.simpleName}!"
    }
}
