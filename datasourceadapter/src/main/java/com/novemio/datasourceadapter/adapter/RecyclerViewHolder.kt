package com.novemio.datasourceadapter.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.novemio.datasourceadapter.item.ItemRenderer
import com.novemio.datasourceadapter.item.RecyclerItem

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