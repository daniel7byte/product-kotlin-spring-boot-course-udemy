package me.daniel7byte.product.services

import me.daniel7byte.product.controllers.BasicCrud
import org.springframework.stereotype.Service

@Service
class ProductService:BasicCrud<Product,String>{
    private val products : Set<Product> = setOf(Product("Apple", 1000), Product("Pear", 2000))

    override fun findAll():List<Product> = products.toList()
    
    override fun findById(id: String): Product? {
        TODO("Not yet implemented")
    }

    override fun save(t: Product): Boolean {
        TODO("Not yet implemented")
    }

    override fun update(t: Product): Boolean {
        TODO("Not yet implemented")
    }

    override fun deleteById(id: String): Boolean {
        TODO("Not yet implemented")
    }
}

data class Product(val name:String, val price:Int?)