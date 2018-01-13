package me.jameshunt.server


import me.jameshunt.server.di.DaggerServerComponent
import me.jameshunt.server.di.ServerModule
import me.jameshunt.server.routes.Hello
import spark.kotlin.get
import spark.kotlin.port

fun main(cows: Array<String>) {
    Start().listen()
}

class Start {

    fun listen() {
        val serverComponent = DaggerServerComponent.builder().serverModule(ServerModule()).build()

        port(8080)

        get("/hello") {
            Hello(request, response, serverComponent)
        }


    }

}