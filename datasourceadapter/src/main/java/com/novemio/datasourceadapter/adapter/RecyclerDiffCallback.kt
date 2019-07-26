package com.novemio.datasourceadapter.adapter

import androidx.recyclerview.widget.DiffUtil
import com.novemio.datasourceadapter.item.RecyclerItem

/**
 * Created by novemio on 4/11/19.
 */
open class RecyclerDiffCallback(
		val oldList: List<RecyclerItem>,
		val newList: List<RecyclerItem>) : DiffUtil.Callback() {

		override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int) =
				oldList[oldItemPosition].getId() == newList[newItemPosition].getId()

		override fun areContentsTheSame(oldItemPosition: Int, newItemPosition: Int) =
			oldList[oldItemPosition] == newList[newItemPosition]

		override fun getOldListSize(): Int = oldList.size

		override fun getNewListSize(): Int = newList.size

}