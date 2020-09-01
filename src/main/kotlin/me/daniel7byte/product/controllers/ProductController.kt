package me.daniel7byte.product.controllers

import me.daniel7byte.product.services.ProductService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/products")
class ProductController {

    @Autowired
    private lateinit var productService: ProductService

    @GetMapping
    fun findAll() = productService.findAll()
}