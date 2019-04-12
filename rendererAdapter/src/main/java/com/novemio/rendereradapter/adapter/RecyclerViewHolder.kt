package com.novemio.rendereradapter.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.novemio.rendereradapter.item.ItemRenderer
import com.novemio.rendereradapter.item.RecyclerItem

/**
 * Created by novemio on 4/11/19.
 */
class RecyclerViewHolder(
    parent: ViewGroup,
    private val itemRenderer: ItemRenderer< out RecyclerItem>
) : RecyclerView.ViewHolder(itemRenderer.createView(parent)) {

    fun bind(recyclerItem: RecyclerItem) {
        itemRenderer.render(itemView, recyclerItem)
    }
}