package com.novemio.rendereradapter.screens

import android.view.View
import com.novemio.rendereradapter.R
import com.novemio.rendereradapter.item.ItemRenderer
import com.novemio.rendereradapter.item.ViewBinderBase
import kotlinx.android.synthetic.main.rv_item_section.view.*
import javax.inject.Inject

class SectionRenderer
@Inject constructor() : ItemRenderer<Section> {

    override fun itemRes() = R.layout.rv_item_section

    override fun getViewBinder(view: View) = SectionViewBinder(view)
}

class SectionViewBinder(view: View) : ViewBinderBase<Section>(view) {
    override fun bind(item: Section) {
        itemView.tvName.text = item.name
    }

}