package me.daniel7byte.product.controllers

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api")
class HelloController {

    @GetMapping
    fun hello() = "Hello World"

    @GetMapping("/test")
    fun test(): String {
        return "This is a test!"
    }

}