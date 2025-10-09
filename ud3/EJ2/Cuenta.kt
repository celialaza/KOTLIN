package com.example.ud3.EJ2

class Cuenta(nombre: String, apellido: String , telefono: String, val numCuenta:String, saldo: Int, val propietario: Persona? ):Persona(nombre, apellido, telefono) {
    constructor(): this("","","","",0,null)

    var saldo: Int=saldo
        set (value){
            if (saldo< 0){
                throw IllegalArgumentException("El saldo no puede ser menor que 0")
            } else {
                field= value
            }
            }


    override fun toString(): String {
        return "Cuenta(numCuenta='$numCuenta', saldo=$saldo, propietario=$propietario)"
    }
    fun transaccion (cantidad:Int, tipoDeTransaccion:String){
       if (tipoDeTransaccion.equals("reintegro"))

    }

}