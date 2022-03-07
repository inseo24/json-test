package com.example.jsontest

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class Controller(
    val readJsonFileToJsonObject: ReadJsonFileToJsonObject
) {

    @GetMapping("/test")
    fun getData() {
        val data = readJsonFileToJsonObject.getJsonData()
        println(data)
    }
}