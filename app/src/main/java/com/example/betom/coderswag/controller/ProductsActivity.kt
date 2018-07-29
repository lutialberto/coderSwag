package com.example.betom.coderswag.controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.betom.coderswag.R
import com.example.betom.coderswag.Utilities.EXTRA_CATEGORY

class ProductsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_products)

        val category = intent.getStringExtra(EXTRA_CATEGORY)
    }
}
