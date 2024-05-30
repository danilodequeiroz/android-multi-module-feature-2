package com.github.danilodequeiroz.mm.feature_module_2.data

import com.github.danilodequeiroz.mm.feature_module_2.model.Greeting

class GreetingRepositoryImpl :GreetingRepository {
    private val list = mutableListOf<Greeting>()

    override fun getGreeting(): Greeting {
        return list.random()
    }

    override fun setGreeting(greeting: Greeting) {
        list.add(greeting)
    }

    override fun clearGreeting() {
        list.clear()
    }
}