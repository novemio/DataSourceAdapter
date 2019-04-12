package com.novemio.rendereradapter.item

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.LayoutRes

/**
 * Created by novemio on 4/11/19.
 */
interface ItemRenderer<Item : RecyclerItem> {


    @LayoutRes
    fun itemRes(): Int

    fun getViewBinder(view: View): ViewBinderBase<Item>

    fun createView(parent: ViewGroup): View =
        LayoutInflater.from(parent.context).inflate(itemRes(), parent, false).apply {
            tag = getViewBinder(this)
        }


    fun render(itemView: View, item: RecyclerItem) {
        @Suppress("UNCHECKED_CAST")
        (itemView.tag as ViewBinderBase<RecyclerItem>).bindInternal(item)
    }

}

abstract class ViewBinderBase<Item>(protected val itemView: View) {
    protected var item: Item? = null

    internal fun bindInternal(item: Item) {
        this.item = item
        bind(item)
    }

    abstract fun bind(item: Item)
}