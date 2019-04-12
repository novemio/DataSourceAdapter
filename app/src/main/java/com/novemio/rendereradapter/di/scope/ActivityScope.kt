package com.novemio.rendereradapter.di.scope

import javax.inject.Scope

/**
 * This scope signalizes that all dependencies provided by the components annotated with this scope
 * will remain valid during the lifetime of the Activity into which they were injected.
 * This means that if you have an Activity "A" and you inject an object "B" into it, that object will
 * be valid between the calls to the activity's onCreate() and onDestroy() methods.
 */
@Scope
@MustBeDocumented
@Retention(value = AnnotationRetention.RUNTIME)
annotation class ActivityScope
