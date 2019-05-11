package com.ehword.coderswag.Services

import com.ehword.coderswag.Model.Category
import com.ehword.coderswag.Model.Product

object DataService {

    val categories = listOf(
        Category("SHIRTS","shirtimage"),
        Category("HOODIES","hoodieimage"),
        Category("HATS","hatimage"),
        Category("DIGITAL","digitalgoodsimage"),
        Category("SHIRTS","shirtimage"),
        Category("HOODIES","hoodieimage"),
        Category("HATS","hatimage"),
        Category("DIGITAL","digitalgoodsimage"),
        Category("SHIRTS","shirtimage"),
        Category("HOODIES","hoodieimage"),
        Category("HATS","hatimage"),
        Category("DIGITAL","digitalgoodsimage")
    )

    val hats = listOf(
        Product("Devslopes Graphic Beanie","$18","hat1"),
        Product("Devslopes Black Hat","$21","hat2"),
        Product("Devslopes White Hat","$21","hat3"),
        Product("Devslopes Snapback Hat","$118","hat4")
    )

    val hoodies = listOf(
        Product("Devslopes Hoodie Grey","$28","hoodie1"),
        Product("Devslopes Hoodie Red","$41","hoodie2"),
        Product("Devslopes Hoodie Grey","$41","hoodie3"),
        Product("Devslopes Hoodie Black","$48","hoodie4")
    )

    val shirts = listOf(
        Product("Devslopes Shirt Black","$28","shirt1"),
        Product("Devslopes Shirt Light Grey","$41","shirt2"),
        Product("Devslopes Shirt Red","$41","shirt3"),
        Product("Devslopes Hustle","$41","shirt4"),
        Product("Kickflip Studios","$48","shirt5")
    )


}