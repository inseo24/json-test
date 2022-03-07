package com.example.jsontest

import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import org.apache.commons.io.FileUtils
import org.springframework.core.io.ClassPathResource
import org.springframework.stereotype.Service
import java.io.File

@Service
class ReadJsonFileToJsonObject {

    fun getJsonData() : TestData {
        File.createTempFile("test", ".json")
            .run {
                FileUtils.copyInputStreamToFile(
                    ClassPathResource("assets/test.json").inputStream,
                    this
                )
                return@getJsonData jacksonObjectMapper().readValue(
                    this.readText(charset = Charsets.UTF_8),
                    TestData::class.java
                )
            }
    }

}