//package com.novemio.boostadapter.screens
//
//import com.novemio.boostadapter.di.scope.ActivityScope
//import com.novemio.boostadapter.item.ItemRenderer
//import com.novemio.boostadapter.item.RenderKey
//import dagger.Binds
//import dagger.Module
//import dagger.Provides
//import dagger.multibindings.IntoMap
//
//
//@Module
//abstract class MainActivityModule {
//
//
//    @Binds
//    @IntoMap
//    @RenderKey("Test")
//    abstract fun bindTestRenderer(renderer: TestRenderer): ItemRenderer<Test>
//
//    //
//
//    @Module
//    companion object {
//        @ActivityScope
//        @Provides
//        fun provideDataSource(map: Map<String, ItemRenderer< Test>>): TestDataSource {
//            return TestDataSource(map)
//        }
//    }
//
//}
