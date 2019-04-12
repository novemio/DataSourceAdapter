package com.example.datasourceadapter.di

import com.example.datasourceadapter.di.scope.ActivityScope
import com.example.datasourceadapter.screens.MainActivity
import com.example.datasourceadapter.screens.MainModule
import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 * Created by xix on 9/25/17.
 */


@Module
abstract class ActivityBuilder {


    @ActivityScope
    @ContributesAndroidInjector(modules = [MainModule::class])
    internal abstract fun bindMainctivity(): MainActivity

}
