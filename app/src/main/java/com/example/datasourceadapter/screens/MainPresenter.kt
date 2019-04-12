package com.example.datasourceadapter.screens

import android.os.Handler
import android.os.Looper
import java.util.*
import javax.inject.Inject
import kotlin.concurrent.schedule


/**
 * Created by novemio on 4/12/19.
 */

class MainPresenter
@Inject
constructor(private val dataSource: TestDataSource) {
    init {

        dataSource.setData(listOf(Section("Section"), Test("Milan"), Test("Dunja")))



        Timer().schedule(5000) {
            runOnUiThread {
                dataSource.setData(listOf(Section("Section"), Test("Test"), Test("Dunja")))
            }
            Timer().schedule(2000) {
                runOnUiThread {
                    dataSource.deleteItem(1)
                }
            }
        }




    }

    fun init() {


    }

}

inline fun Any.runOnUiThread(crossinline func: () -> Unit) {
    Handler(Looper.getMainLooper()).post {
        func.invoke()
    }

}