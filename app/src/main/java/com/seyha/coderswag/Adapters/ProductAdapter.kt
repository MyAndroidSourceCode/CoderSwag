package com.seyha.coderswag.Adapters

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.seyha.coderswag.Model.Product
import com.seyha.coderswag.R
import kotlinx.android.synthetic.main.product_list_item.view.*

class ProductAdapter(val context: Context, val products: List<Product>): RecyclerView.Adapter<ProductAdapter.ProductHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, position: Int): ProductHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.product_list_item, parent, false)
        return ProductHolder(view)
    }

    override fun getItemCount(): Int {
       return products.count()
    }

    override fun onBindViewHolder(parent: ProductHolder, position: Int) {
        parent.bindProduct(context, products[position])
    }

    inner class ProductHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val productImage = itemView.findViewById<ImageView>(R.id.productImage)
        val productTitleText = itemView.findViewById<TextView>(R.id.productTitleText)
        val productPriceText = itemView.findViewById<TextView>(R.id.productPriceText)

        fun bindProduct(context: Context, product: Product) {
            val resourceId = context.resources.getIdentifier(product.image, "drawable", context.packageName)
            productImage.setImageResource(resourceId)
            productPriceText.text = product.price
            productTitleText.text = product.title
        }
    }
}