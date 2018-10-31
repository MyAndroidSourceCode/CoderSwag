package com.seyha.coderswag.Controller

import android.content.res.Configuration
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import com.seyha.coderswag.Adapters.ProductAdapter
import com.seyha.coderswag.Model.Category
import com.seyha.coderswag.R
import com.seyha.coderswag.Services.DataService
import com.seyha.coderswag.Utilities.EXTRA_CATEGORY
import kotlinx.android.synthetic.main.activity_product.*

class ProductActivity : AppCompatActivity() {


    lateinit var adapter: ProductAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product)

        val category: Category = intent.getParcelableExtra(EXTRA_CATEGORY)
        adapter = ProductAdapter(this, DataService.getProductByCategory(category))

        var spanColumn = 2
        val orientationScreen = resources.configuration.orientation
        if(orientationScreen == Configuration.ORIENTATION_LANDSCAPE) {
            spanColumn = 3
        }

        val screenSize = resources.configuration.screenWidthDp
        if(screenSize > 720) {
            spanColumn = 3
        }

        val gridLayoutManager = GridLayoutManager(this, spanColumn)
        productListView.layoutManager = gridLayoutManager
        productListView.adapter = adapter

    }
}
