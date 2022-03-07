package com.example.jsontest

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping

@SpringBootApplication
class JsonTestApplication

fun main(args: Array<String>) {
    runApplication<JsonTestApplication>(*args)
}
