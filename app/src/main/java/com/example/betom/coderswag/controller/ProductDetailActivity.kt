package com.example.betom.coderswag.controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.betom.coderswag.R
import com.example.betom.coderswag.Utilities.EXTRA_PRODUCT
import com.example.betom.coderswag.model.Product
import kotlinx.android.synthetic.main.activity_product_detail.*

class ProductDetailActivity : AppCompatActivity() {

    lateinit var product: Product

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product_detail)

        product =intent.getParcelableExtra<Product>(EXTRA_PRODUCT)
        println("image, name and price: ${product.image}, ${product.title}, ${product.price}")
        val resourceId = resources.getIdentifier(product.image,
                "drawable",packageName)
        productImage?.setImageResource(resourceId)
        productName.text=product.title
        productPrice.text=product.price
    }

    fun productDetailBuyNowClick (view : View){
        Toast.makeText(this,"thanks for buying ;)", Toast.LENGTH_LONG).show()
    }
}
