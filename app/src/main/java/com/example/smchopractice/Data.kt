package com.example.smchopractice

data class Ticket(val companyName : String, val name : String, var date : String, val seatNumber : Int)
// toString(), hashCode(), equals(), copy()

class TicketNomal(val companyName : String, val name : String, var date : String, val seatNumber : Int)


fun main(){
    val ticketA = Ticket("koreanAir", "smcho", "2022-12-12", 13)
    val ticketB = TicketNomal("koreanAir", "smcho", "2022-12-12", 13)

    println(ticketA)
    println(ticketB)
}