package com.github.danilodequeiroz.mm.feature_module_2.data

import com.github.danilodequeiroz.mm.feature_module_2.model.Greeting

interface GreetingRepository {
    fun getGreeting(): Greeting

    fun setGreeting(greeting: Greeting)

    fun clearGreeting()

}