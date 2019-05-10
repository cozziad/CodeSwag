package com.ehword.coderswag.Controller

import android.content.AbstractThreadedSyncAdapter
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.ehword.coderswag.Adaptor.CategoryAdaptor
import com.ehword.coderswag.Model.Category
import com.ehword.coderswag.R
import com.ehword.coderswag.Services.DataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter: CategoryAdaptor

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = CategoryAdaptor(this,DataService.categories)
        categoryListView.adapter = adapter
    }



}
