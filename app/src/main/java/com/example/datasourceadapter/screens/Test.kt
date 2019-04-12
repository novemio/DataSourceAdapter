package com.example.datasourceadapter.screens

import com.novemio.datasourceadapter.item.RecyclerItem

data class Test(val name: String) : RecyclerItem {
    override fun getId() = this.hashCode().toLong()


    override fun renderKey() = "Test"
}
