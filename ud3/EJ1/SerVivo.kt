package com.example.ud3.EJ1

open class SerVivo (protected val edad:Byte) {

    fun equals(other: SerVivo): Boolean {
        if (this.edad.equals(other.edad)){
            return true
        }else{
            return false
        }

    }

    override fun toString(): String {
        return "SerVivo(edad=$edad)"
    }
    fun mayor(other: SerVivo): SerVivo{
        if (this.edad>other.edad){

            return this
        }else{

            return other
        }

    }
}