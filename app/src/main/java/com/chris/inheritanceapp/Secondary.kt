package com.chris.inheritanceapp

class Secondary : BaseClass() {

    override fun role() {
        super.role()
        println("Knight of the House of Baseclass")
    }
}