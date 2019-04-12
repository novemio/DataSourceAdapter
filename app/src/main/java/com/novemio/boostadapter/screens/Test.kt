package com.novemio.boostadapter.screens

import com.novemio.boostadapter.item.RecyclerItem

data class Test(val name: String) : RecyclerItem {
    override fun getId() = this.hashCode().toLong()


    override fun renderKey() = "Test"
}
