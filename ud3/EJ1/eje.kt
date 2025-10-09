package com.example.ud3.EJ1

fun main(){
    val servivo1: SerVivo=SerVivo(3)
    val servivo2:SerVivo=SerVivo(5)
    servivo1.mayor(servivo2)

    val mayor =servivo1.mayor(servivo2)
    println("El mayor es:  $mayor")

    val humano1: Humano= Humano(10,"Homero")
    val humano2: Humano=Humano(10,"Bart")

    val mayorH2=humano2.mayor(humano1)
    println("El humano mayor es: $mayorH2")


}