package com.seyha.coderswag.Services

import com.seyha.coderswag.Model.Category
import com.seyha.coderswag.Model.Product


object DataService {
    val categories = listOf(
            Category("SHIRTS", "shirtimage"),
            Category("HOODIES", "hoodieimage"),
            Category("HATS", "hatimage"),
            Category("DIGITALS", "digitalgoodsimage"),
            Category("SHIRTS", "shirtimage"),
            Category("HOODIES", "hoodieimage"),
            Category("HATS", "hatimage"),
            Category("DIGITALS", "digitalgoodsimage"),
            Category("SHIRTS", "shirtimage"),
            Category("HOODIES", "hoodieimage"),
            Category("HATS", "hatimage"),
            Category("DIGITALS", "digitalgoodsimage")
    )

    val hats = listOf(
            Product("Deslopes Graphic Beenie","$18", "hat1"),
            Product("Deslopes Hat Black","$20", "hat2"),
            Product("Deslopes Hat White","$18", "hat3"),
            Product("Deslopes Hat Snapback","$22", "hat4")
    )


    val hoodie = listOf(
            Product("Deslopes Hoodie Gray","$28", "hoodie1"),
            Product("Deslopes Hoodie Red","$32", "hoodie2"),
            Product("Deslopes Gray Hoodie","$28", "hoodie3"),
            Product("Deslopes Black Hoodie","$32", "hoodie4")
    )

    val shirts = listOf(
            Product("Deslopes Shirt Black","$18", "shirt1"),
            Product("Deslopes Bage Light Gray","$20", "shirt2"),
            Product("Deslopes Logo Shirt Red","$22", "shirt3"),
            Product("Deslopes Hustle","$22", "shirt4"),
            Product("Kickflip Studio","$18", "shirt5")
    )
}