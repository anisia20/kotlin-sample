package com.example.smchopractice

fun main(){
    //3. String Template
//    val name = "smcho"
//    var lastName = "Cho"
//    println("my name is ${name + lastName}.")
//    println("This is 2\$")

}
//7. Nullable / NonNull
fun nullcheck(){
    //NPE : NULL Pointer Exception
    var name = "smcho"
    var nullName : String? = null
    var nameInUpperCase = name.toUpperCase()
    var nullNameInUpperCase = nullName?.toUpperCase()

    // ?: 엘비스프레슬리 연산자
    val lastName : String? = null
    val fullName = name + " " + (lastName?:"NO lastName")
    println(fullName)
}

fun ingnoreNulls(str : String?){
    val mNotNull : String = str!! //지양해야함
    val upper = mNotNull.toUpperCase()

    val email: String? = "test@test.test"
    email?.let{
        println("my email is ${email}")
    }
}

//6. For / While
fun forAndWhile(){

    val students = arrayListOf("smcho","anisia20","samuel","john")
    for ( name in students){
        println("${name}")
    }

    for ((index, name) in students.withIndex()){
        println("${index+1}번째 학생 : ${name}")
    }

    var sum = 0
    for ( i in 1..10 step 2){
        sum += i
    }

//    for ( i in 10 downTo  2){
//        sum += i
//    }
//
//    for ( i in 10 until 100){
//        sum += i
//    }
    println(sum)

    var index = 0
//    while (index < 10){
//        println("current index : ${index}")
//        index++
//    }
}

//5. Array and List
// Array
// List 1. List(수정불가) 2. MutableList(수정가능)
fun array(){
    val array = arrayOf(1,2,3)
    val list = listOf(1,2,3)

    val array2 = arrayOf(1,"d",3,4f)
    val list2 = listOf(1,"b",11L)

    array[0] = 3
    //list[0] = 2

    val arrayList = arrayListOf<Int>() //val을 써도 되는이유 메모리주소는 고정이다.
    arrayList.add(10)
    arrayList.add(20)
}


//4. 조건식
fun maxBy(a : Int, b : Int) : Int {
    if(a > b)
        return a
    else
        return b
}
fun maxBy2(a : Int, b : Int) = if(a>b) a else b
//코틀린 3항 연산자가 없다.

fun checkNum(score : Int){
    when(score){
        0 -> println("this is 0")
        1 -> println("this is 1")
        2,3 -> println("this is 2 or 3")
        else -> println("I don't know")
    }

    var b = when(score){
        1-> 1
        2-> 2
        else-> 3
    }

    println("b: ${b}")

    when(score){
        in 90..100 -> println("You are genius")
        in 10..80 -> println("not bad")
        else -> println("okay")
    }

}
// Expression(kotlin :Unit) vs Statement(java void)


//1. 함수
fun helloWorld() {
    println("Hello World!")
}

fun add(a : Int, b: Int) : Int {
    return a + b
}
//2. val vs var
//val = value
fun hi(){
    val a : Int = 10 //상수
    var b : Int = 9 //변수

    var e : String

    val c = 100
    var d = 100

    var name = "smcho"

}
