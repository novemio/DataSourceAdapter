package com.novemio.rendereradapter.screens

import android.view.View
import com.novemio.rendereradapter.R
import com.novemio.rendereradapter.item.ItemRenderer
import com.novemio.rendereradapter.item.ViewBinderBase
import kotlinx.android.synthetic.main.rv_item_section.view.*
import javax.inject.Inject

class TestRenderer
@Inject constructor() : ItemRenderer<Test> {

    override fun itemRes() = R.layout.rv_item_test

    override fun getViewBinder(view: View) = TestRenderer.TestViewBinder(view)

    class TestViewBinder(view: View) : ViewBinderBase<Test>(view) {
        override fun bind(item: Test) {
            itemView.tvName.text = item.name
        }

    }
}


