package org.example

import com.sun.org.slf4j.internal.LoggerFactory

class SomeClass {
    companion object {
        private val logger = LoggerFactory.getLogger(SomeClass::class.java)
        const val I = 1
    }

    init {
        println(I)
    }
}