package com.novemio.rendereradapter.di

import com.novemio.rendereradapter.di.scope.ActivityScope
import com.novemio.rendereradapter.screens.MainActivity
import com.novemio.rendereradapter.screens.MainModule
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
