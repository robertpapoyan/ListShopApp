package com.example.listshopapp.Services

import com.example.listshopapp.Model.Category
import com.example.listshopapp.Model.Product

/**This Kotlin file is for initializing the listview items. Here we are initializing them in Lists. **/

object DataService {

    /**The values that are given in list, such as <price> are going to be changed. Note that this is just for first view <Skeleton>**/

    //Here we have the categories initialized in list, for using them in ListView
    val categories = listOf(

        Category("SHIRTS", "shirtimage"),
        Category("HOODIES", "hoodieimage"),
        Category("SHIRTS", "shirtimage"),
        Category("HOODIES", "hoodieimage"),
        Category("SHIRTS", "shirtimage"),
        Category("HOODIES", "hoodieimage"),
        Category("SHIRTS", "shirtimage"),
        Category("HOODIES", "hoodieimage"),
        Category("HATS", "hatimage")
    )

    //Here we have products initialized in list, for using them in ListView
    val shirts = listOf(

        Product("Fantastic Shirt", "10$", "shirt1"),
        Product("Fantastic Shirt", "10$", "shirt2"),
        Product("Fantastic Shirt", "10$", "shirt3"),
        Product("Fantastic Shirt", "10$", "shirt4"),
        Product("Fantastic Shirt", "10$", "shirt5")
    )

    val hoodies = listOf(
        Product("Fantastic Hoodie", "10$", "hoodie1"),
        Product("Fantastic Hoodie", "10$", "hoodie2"),
        Product("Fantastic Hoodie", "10$", "hoodie3"),
        Product("Fantastic Hoodie", "10$", "hoodie4")
    )

    val hats = listOf(
        Product("Fantastic Hat", "10$", "hat1"),
        Product("Fantastic Hat", "10$", "hat2"),
        Product("Fantastic Hat", "10$", "hat3"),
        Product("Fantastic Hat", "10$", "hat4")
    )


}