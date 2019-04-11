package com.novemio.boostadapter.item

import android.view.View
import android.view.ViewGroup
import androidx.annotation.LayoutRes

/**
 * Created by novemio on 4/11/19.
 */
interface ItemRenderer<Item : RecyclerItem> {


    @LayoutRes
    fun itemRes(): Int

    fun createView(parent: ViewGroup): View

    fun render(itemView: View, item: Item)

}