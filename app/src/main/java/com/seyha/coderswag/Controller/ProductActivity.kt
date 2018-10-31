package com.seyha.coderswag.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.seyha.coderswag.Model.Category
import com.seyha.coderswag.R
import com.seyha.coderswag.Utilities.EXTRA_CATEGORY

class ProductActivity : AppCompatActivity() {

    lateinit var category: Category

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product)

        category = intent.getParcelableExtra(EXTRA_CATEGORY)

        println(category.title)
    }
}
