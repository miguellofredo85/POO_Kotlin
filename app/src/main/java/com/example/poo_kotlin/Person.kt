package com.jotajotavm.poo

open class Person(var name: String = "Anonimo", var passport: String? = null): thanks() {
    var alive: Boolean = true

    fun Person(){
        name = "Juan"
        passport = "B8461531"
    }
    fun die(){ alive = false }
}

class Athlete(name: String, passport: String?, var sport: String): Person(name, passport)