package com.novemio.boostadapter.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

/**
 * Created by novemio on 4/11/19.
 */

class RecyclerAdapter(
		private val recyclerDataSource: RecyclerDataSource
) : RecyclerView.Adapter<RecyclerViewHolder>() {


		init {
				recyclerDataSource.attachAdapter(this)
		}

		override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewHolder {
				return RecyclerViewHolder(parent, recyclerDataSource.rendererForType(viewType))
		}

		override fun onBindViewHolder(holder: RecyclerViewHolder, position: Int) {
				holder.bind(recyclerDataSource.getItem(position))
		}

		override fun getItemCount(): Int {
				return recyclerDataSource.getCount()
		}

}