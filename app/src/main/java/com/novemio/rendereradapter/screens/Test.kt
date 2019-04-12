package com.novemio.rendereradapter.screens

import com.novemio.rendereradapter.item.RecyclerItem

data class Test(val name: String) : RecyclerItem {
    override fun getId() = this.hashCode().toLong()


    override fun renderKey() = "Test"
}
