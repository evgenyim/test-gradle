package org.example

import com.sun.org.slf4j.internal.LoggerFactory

class SomeClass {
    companion object {
        private val logger2 = LoggerFactory.getLogger(SomeClass::class.java)
    }

    init {
        println(logger2)
    }
}