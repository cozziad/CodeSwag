package com.ehword.coderswag.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.ehword.coderswag.Model.Product
import com.ehword.coderswag.R
import com.ehword.coderswag.Utilities.EXTRA_PRODUCT
import kotlinx.android.synthetic.main.activity_product_detail.*

class ProductDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product_detail)

        val product = intent.getParcelableExtra<Product>(EXTRA_PRODUCT)
        productNameTxt.text = product.title
        productDescTxt.text = product.desc
        productPriceTxt.text = product.price
        val resourceId = this.resources.getIdentifier(product.image,"drawable",this.packageName)
        productImage.setImageResource(resourceId)


        //searchLeaguesTxt.text = "Looking for a ${player.league} ${player.skill} league near you"
    }
}
