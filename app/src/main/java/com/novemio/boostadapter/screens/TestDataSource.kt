package com.novemio.boostadapter.screens

import com.novemio.boostadapter.adapter.RecyclerDataSource
import com.novemio.boostadapter.item.ItemRenderer
import com.novemio.boostadapter.item.RecyclerItem

/**
 * Created by novemio on 4/12/19.
 */
class TestDataSource(map: Map<String, ItemRenderer<out RecyclerItem>>) :
    RecyclerDataSource(map) {

}