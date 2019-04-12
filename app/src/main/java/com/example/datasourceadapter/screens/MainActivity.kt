package com.example.datasourceadapter.screens

import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.novemio.datasourceadapter.R
import com.novemio.datasourceadapter.adapter.RecyclerAdapter
import dagger.android.DaggerActivity
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : DaggerActivity() {

    //
    @Inject
    lateinit var presenter: MainPresenter
    @Inject
    lateinit var dataSource: TestDataSource

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initAdapter()
        initPresenter()
    }

    private fun initPresenter() {

    }

    private fun initAdapter() {

        rvTestList.layoutManager = LinearLayoutManager(this)
        rvTestList.adapter = RecyclerAdapter(dataSource)

    }
}
