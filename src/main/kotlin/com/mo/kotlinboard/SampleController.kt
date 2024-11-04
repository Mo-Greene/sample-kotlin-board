package com.mo.kotlinboard

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class SampleController {
    @GetMapping("/sample")
    fun sample(): String = "sample"

    @PostMapping("/sample")
    fun postSample(
        @RequestParam name: String,
    ): String = "Hello $name"
}
