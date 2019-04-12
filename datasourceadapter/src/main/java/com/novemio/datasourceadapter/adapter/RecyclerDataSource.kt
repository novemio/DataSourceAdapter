package com.novemio.datasourceadapter.adapter

import androidx.annotation.LayoutRes
import androidx.annotation.MainThread
import androidx.annotation.VisibleForTesting
import androidx.recyclerview.widget.DiffUtil
import com.novemio.datasourceadapter.item.ItemRenderer
import com.novemio.datasourceadapter.item.RecyclerItem
import java.lang.ref.WeakReference

/**
 * Created by novemio on 4/11/19.
 */
open class RecyclerDataSource(
    protected val renderers: Map<String, ItemRenderer<out RecyclerItem>>
) {

    protected  var recyclerReference: WeakReference<RecyclerAdapter> ?= null

    protected val viewTypeToRenderKeyMap = HashMap<Int, String>()
    private val data = mutableListOf<RecyclerItem>()

    init {
        renderers.forEach {
            viewTypeToRenderKeyMap[it.value.itemRes()] = it.key
        }
    }

    internal fun attachAdapter(recyclerAdapter: RecyclerAdapter) {
        this.recyclerReference = WeakReference(recyclerAdapter)
    }

    fun rendererForType(viewType: Int) = renderers[viewTypeToRenderKeyMap[viewType]]!!

    @LayoutRes
    fun viewResourceForPosition(position: Int) = renderers.getValue(data[position].renderKey()).itemRes()

    @MainThread
    fun setData(collection: List<RecyclerItem>) {

        val diffResult = DiffUtil.calculateDiff(RecyclerDiffCallback(data, collection))

        data.clear()
        data.addAll(collection)
        recyclerReference?.get()
            ?.let {
                diffResult.dispatchUpdatesTo(it)
            }

    }

    @MainThread
    fun deleteItem(position:Int){
        data.removeAt(position)
        recyclerReference?.get()?.notifyItemRemoved(position)
    }

    @VisibleForTesting
    fun setTestData(collection: List<RecyclerItem>) {
        data.clear()
        data.addAll(collection)
    }


    fun getItem(position: Int) = data.get(position)

    fun getCount() = data.count()



}