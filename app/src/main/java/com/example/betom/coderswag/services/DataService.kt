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
            Product("Devslopes Graphic Beanie","$18","hat01"),
            Product("Devslopes Hat Black","$20","hat02"),
            Product("Devslopes Hat White","$10","hat03"),
            Product("Devslopes Hat Snapback","$22","hat04"),
    )

    val hoodies = listOf(
            Product("Devslopes Hoodie Gray","$28","hoodie01"),
            Product("Devslopes Hoodie Red","$32","hoodie02"),
            Product("Devslopes Gray Hoodie","$30","hoodie03"),
            Product("Devslopes Black Hoodie","$29","hoodie04"),
    )

    val shirts = listOf(
            Product("Devslopes Shirt Black","$18","shirt01"),
            Product("Devslopes Badge Light Gray","$20","shirt02"),
            Product("Devslopes Logo Shirt Red","$22","shirt03"),
            Product("Devslopes Hustle","$22","shirt04"),
            Product("Kickflip Studios","$18","shirt05")
    )
}