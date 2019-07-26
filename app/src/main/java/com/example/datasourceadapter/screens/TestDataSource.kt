package com.example.datasourceadapter.screens

import com.novemio.datasourceadapter.adapter.RecyclerDataSource
import com.novemio.datasourceadapter.item.ItemRenderer
import com.novemio.datasourceadapter.item.RecyclerItem

/**
 * Created by novemio on 4/12/19.
 */
class TestDataSource(map: Map<String, ItemRenderer<out RecyclerItem>>) : RecyclerDataSource(map) {

}