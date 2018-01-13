package me.jameshunt.server.routes

import me.jameshunt.server.di.ServerComponent
import spark.Request
import spark.Response
import spark.Route
import javax.inject.Inject

class Hello(request: Request, response: Response, serverComponent: ServerComponent): Route {

    init {
        serverComponent.inject(this)
    }

    @Inject
    lateinit var validator: Validator


    override fun handle(request: Request, response: Response): Any {
        throw NotImplementedError()
    }

}