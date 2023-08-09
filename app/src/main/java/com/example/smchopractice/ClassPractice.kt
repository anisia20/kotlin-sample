package com.example.smchopractice

//8. class
open class Human(val name : String = "Anonymous"){
    constructor(name: String, age : Int) : this(name){
        println("my name is ${name}, ${age}years old")
    }

    init {
        println("New human has been born")
    }

    fun eatingCake(){
        println("This is so good~")
    }

    open fun singASong(){
        println("lalalala")
    }
}

class Korean : Human(){
    override fun singASong(){
        super.singASong()
        println("blabla")
        println("my name is :${name}")
    }
}

fun main(){
//    var human = Human()
//    human.eatingCake()
//    val mom = Human("mom", 60)
//    println("This is human's name is ${human.name}")

    val korean = Korean()
    korean.singASong()
}