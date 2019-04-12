package com.novemio.rendereradapter.screens;

import com.novemio.rendereradapter.di.scope.ActivityScope;
import com.novemio.rendereradapter.item.ItemRenderer;
import com.novemio.rendereradapter.item.RecyclerItem;
import com.novemio.rendereradapter.item.RenderKey;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoMap;

import java.util.Map;

/**
 * Created by novemio on 4/12/19.
 */
@Module
public abstract class MainModule {

    @Provides
    static MainPresenter bindPresenter(TestDataSource testDataSource) {
        return new MainPresenter(testDataSource);
    }


    @Binds
    @IntoMap
    @RenderKey("Test")
    abstract ItemRenderer<? extends RecyclerItem> bindTestRenderer(TestRenderer renderer);

    @Binds
    @IntoMap
    @RenderKey("Section")
    abstract ItemRenderer<? extends RecyclerItem> bindSectionenderer(SectionRenderer renderer);

    //


    @ActivityScope
    @Provides
    static TestDataSource provideDataSource(Map<String, ItemRenderer<? extends RecyclerItem>> map) {
        return new TestDataSource(map);
    }

}
