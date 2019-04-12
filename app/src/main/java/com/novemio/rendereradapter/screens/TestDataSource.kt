package com.novemio.rendereradapter.screens

import com.novemio.rendereradapter.adapter.RecyclerDataSource
import com.novemio.rendereradapter.item.ItemRenderer
import com.novemio.rendereradapter.item.RecyclerItem

/**
 * Created by novemio on 4/12/19.
 */
class TestDataSource(map: Map<String, ItemRenderer<out RecyclerItem>>) : RecyclerDataSource(map) {

}