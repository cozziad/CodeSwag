package com.ehword.coderswag.Controller

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import com.ehword.coderswag.Adaptor.CategoryRecycleAdaptor
import com.ehword.coderswag.R
import com.ehword.coderswag.Services.DataService
import com.ehword.coderswag.Utilities.EXTRA_CATEGORY
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter: CategoryRecycleAdaptor

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = CategoryRecycleAdaptor(this,DataService.categories) {
            category -> val productIntent = Intent(this, ProductsActivity::class.java)
            productIntent.putExtra(EXTRA_CATEGORY,category.title)
            startActivity(productIntent)
        }
        categoryListView.adapter = adapter

//        categoryListView.setOnItemClickListener { adaptorView, view, i, l ->
//            val category = DataService.categories[i]
//            Toast.makeText(this,"You clicked on the ${category.title} cell", Toast.LENGTH_SHORT).show()
//
        val layoutManager = LinearLayoutManager (this)
        categoryListView.layoutManager = layoutManager
        categoryListView.setHasFixedSize(true)



    }
}




