package com.example.ud3.EJ2

open class Persona(val nombre: String,val apellido: String,  telefono: String ) {
    //La propiedad tlf se declara como var para permitir modificaciones
    var telefono: String =telefono
    //aquí validamos que el tlfd tenga 9 carácteres y sea dígitos del 0-9.
    //si alguna condición no se cumple lanza la excepción y si no se asigna el valor a field y se
    //aplica el valor inicial de tlf pasado al constructor, ya que el setter se ejecuta al inicializar la propiedad
        set (value){
            if(value.length != 9 || !value.all { it.isDigit() }){
                throw IllegalArgumentException("El tlf debe tener 9 dígitos")
            } else {
                field= value
            }
        }

    override fun toString(): String {
        return "Persona(nombre='$nombre', apellido='$apellido', telefono='$telefono')"
    }
    fun transaccion():


}