package me.daniel7byte.product.services

import org.springframework.stereotype.Service

@Service
class ProductService {
    private val products : Set<Product> = setOf(Product("Apple", 1000), Product("Pear", 2000))

    fun findAll():List<Product> = products.toList()
}

data class Product(val name:String, val price:Int?)