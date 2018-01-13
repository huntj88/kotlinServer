package me.jameshunt.server.di

import dagger.Component
import me.jameshunt.server.routes.Hello
import javax.inject.Singleton

@Singleton
@Component(modules = [(ServerModule::class)])
interface ServerComponent {
    fun inject(hello: Hello)
}