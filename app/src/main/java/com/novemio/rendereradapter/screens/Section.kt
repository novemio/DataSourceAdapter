package com.novemio.rendereradapter.screens

import com.novemio.rendereradapter.item.RecyclerItem

data class Section(val name: String) : RecyclerItem {
    override fun getId() = this.hashCode().toLong()


    override fun renderKey() = "Section"
}
