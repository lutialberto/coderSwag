package com.example.betom.coderswag.services

import com.example.betom.coderswag.model.Category
import com.example.betom.coderswag.model.Product

object DataService {
    val categories = listOf(
            Category("Shirts","shirtimage"),
            Category("Hoodies","hoodieimage"),
            Category("Hats","hatimage"),
            Category("Digital","digitalgoodsimage")
    )

    val hats = listOf(
            Product("Devslopes Graphic Beanie","$18","hat1"),
            Product("Devslopes Hat Black","$20","hat2"),
            Product("Devslopes Hat White","$10","hat3"),
            Product("Devslopes Hat Snapback","$22","hat4")
    )

    val hoodies = listOf(
            Product("Devslopes Hoodie Gray","$28","hoodie1"),
            Product("Devslopes Hoodie Red","$32","hoodie2"),
            Product("Devslopes Gray Hoodie","$30","hoodie3"),
            Product("Devslopes Black Hoodie","$29","hoodie4")
    )

    val shirts = listOf(
            Product("Devslopes Shirt Black","$18","shirt1"),
            Product("Devslopes Badge Light Gray","$20","shirt2"),
            Product("Devslopes Logo Shirt Red","$22","shirt3"),
            Product("Devslopes Hustle","$22","shirt4"),
            Product("Kickflip Studios","$18","shirt5")
    )

    val digitalGoods = listOf<Product>()

    fun getProducts(category : String ) : List<Product> {

        return when(category) {
            "SHIRTS" -> shirts
            "HATS" -> hats
            "HOODIES" -> hoodies
            else -> digitalGoods
        }
    }
}