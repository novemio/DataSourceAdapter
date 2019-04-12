package com.novemio.boostadapter.di

import com.novemio.boostadapter.AppApplication
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

/**
 * Created by novemio on 4/11/19.
 */

@Singleton
@Component(modules = [AndroidSupportInjectionModule::class,ActivityBuilder::class])
interface AppComponent : AndroidInjector<AppApplication> {

    @Component.Builder
    abstract class Builder : AndroidInjector.Builder<AppApplication>()

}