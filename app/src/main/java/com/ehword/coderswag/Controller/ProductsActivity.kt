package com.ehword.coderswag.Controller

import android.content.Intent
import android.content.res.Configuration
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import com.ehword.coderswag.Adaptor.ProductsAdaptor
import com.ehword.coderswag.R
import com.ehword.coderswag.Services.DataService
import com.ehword.coderswag.Utilities.EXTRA_CATEGORY
import com.ehword.coderswag.Utilities.EXTRA_PRODUCT
import kotlinx.android.synthetic.main.activity_products.*

class ProductsActivity : AppCompatActivity() {

    lateinit var adapter: ProductsAdaptor

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_products)

        val categoryType = intent.getStringExtra(EXTRA_CATEGORY)
        adapter = ProductsAdaptor(this, DataService.getProducts(categoryType)){
                product -> val productDetailIntent = Intent(this, ProductDetailActivity::class.java)
            //productIntent.putExtra(EXTRA_CATEGORY,category.title)
            productDetailIntent.putExtra(EXTRA_PRODUCT,product)
            startActivity(productDetailIntent)
        }

        var spanCount = 2
        val orientation = resources.configuration.orientation
        if (orientation == Configuration.ORIENTATION_LANDSCAPE)
        {
            spanCount = 3
        }

        val screenSize = resources.configuration.screenWidthDp
        if (screenSize > 720){
            spanCount = 3
        }

        val layoutManager = GridLayoutManager(this,spanCount)
        productListView.layoutManager = layoutManager
        productListView.adapter = adapter
    }
}
