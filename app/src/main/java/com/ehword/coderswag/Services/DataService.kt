package com.ehword.coderswag.Services

import com.ehword.coderswag.Model.Category
import com.ehword.coderswag.Model.Product

object DataService {

    val categories = listOf(
        Category("SHIRTS","shirtimage"),
        Category("HOODIES","hoodieimage"),
        Category("HATS","hatimage"),
        Category("DIGITAL","digitalgoodsimage")
    )

    val hats = listOf(
        Product("Devslopes Graphic Beanie","$18","hat1","Super slick graphic beanie hat"),
        Product("Devslopes Black Hat","$21","hat2","Rad AF black hat ftw"),
        Product("Devslopes White Hat","$21","hat3","White wicked hat time"),
        Product("Devslopes Snapback Hat","$118","hat4","Flat brim snapback wearable back or front")
    )

    val hoodies = listOf(
        Product("Devslopes Hoodie Grey","$28","hoodie1","Grey hoodie - charcoal is cool AF"),
        Product("Devslopes Hoodie Red","$41","hoodie2","Red hoodie, so red it's like a devil"),
        Product("Devslopes Hoodie Grey","$41","hoodie3","Super slick graphic hoodie in grey"),
        Product("Devslopes Hoodie Black","$48","hoodie4","Black goody hoodie")
    )

    val shirts = listOf(
        Product("Devslopes Shirt Black","$28","shirt1","Black shirt, looks good on ladies and gents"),
        Product("Devslopes Shirt Light Grey","$41","shirt2","Light grey cool shirt"),
        Product("Devslopes Shirt Red","$41","shirt3","Red ted bed head shirt"),
        Product("Devslopes Hustle","$41","shirt4","Everyday we hustling, hustling hustling"),
        Product("Kickflip Studios","$48","shirt5","Kickflip is the new studio winner, buy this shirt to full rep it")
    )

    val digitalgoods = listOf<Product>()

    fun getProducts(category:String) : List<Product> {
        return when (category) {
            "SHIRTS" -> shirts
            "HATS" -> hats
            "HOODIES" -> hoodies
            else -> digitalgoods
        }
    }

}