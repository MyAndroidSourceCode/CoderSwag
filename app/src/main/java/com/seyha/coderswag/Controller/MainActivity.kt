package com.seyha.coderswag.Controller

import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.Toast
import com.seyha.coderswag.Adapters.CategoryAdapter
import com.seyha.coderswag.Adapters.CategoryRecycleAdapter
import com.seyha.coderswag.Model.Category
import com.seyha.coderswag.R
import com.seyha.coderswag.Services.DataService
import com.seyha.coderswag.Utilities.EXTRA_CATEGORY
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter: CategoryRecycleAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        setupRecycleAdapter(this, DataService.categories)
        setupLayoutManager(this)

    }

    private fun setupRecycleAdapter(context: Context, categories: List<Category>) {
        adapter = CategoryRecycleAdapter(context, categories) { category ->
            val productItent = Intent(this, ProductActivity::class.java)
            productItent.putExtra(EXTRA_CATEGORY, category)
            startActivity(productItent)
        }
        categoryListView.adapter = adapter
    }

    private fun setupLayoutManager(context: Context) {
        val layoutManager = LinearLayoutManager(context)
        categoryListView.layoutManager = layoutManager
        categoryListView.setHasFixedSize(true)
    }
}
