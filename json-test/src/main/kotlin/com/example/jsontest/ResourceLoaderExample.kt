package com.example.jsontest

import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import org.springframework.boot.ApplicationArguments
import org.springframework.boot.ApplicationRunner
import org.springframework.core.io.ResourceLoader
import org.springframework.stereotype.Component

@Component
class ResourceLoaderExample(
    val resourceLoader: ResourceLoader
): ApplicationRunner {

    override fun run(args: ApplicationArguments?) {
        val resource = resourceLoader.getResource("classpath:assets/test.json")
        println(resource.exists())
        println(resource.description)
        val data = jacksonObjectMapper().readValue(resource.file, TestData::class.java)
        println(data)

    }
}