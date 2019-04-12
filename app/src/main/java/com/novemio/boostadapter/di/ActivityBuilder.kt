package com.novemio.boostadapter.di

import com.novemio.boostadapter.di.scope.ActivityScope
import com.novemio.boostadapter.screens.MainActivity
import com.novemio.boostadapter.screens.MainModule
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
