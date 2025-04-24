package org.example

class SomeClass {
    companion object {
        val obsoleteString = "Obsolete"
        val newString = "New"
    }

    init {
        println(newString)
    }
}