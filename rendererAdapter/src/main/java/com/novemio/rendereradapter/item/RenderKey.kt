package com.novemio.rendereradapter.item

import dagger.MapKey

/**
 * Created by novemio on 4/11/19.
 */

@MapKey
@Target(AnnotationTarget.FUNCTION)
annotation class RenderKey(val value: String)