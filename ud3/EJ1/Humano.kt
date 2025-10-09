package com.example.ud3.EJ1

class Humano(edad: Byte, val nombre:String): SerVivo(edad){

    override fun toString(): String {
        return super.toString()+"Humano(nombre='$nombre')"
    }
     fun equals(other: Humano): Boolean {
        if (this.edad.equals(other.edad) && this.nombre.equals(other.nombre)){
            return true
        }else{
            return false
        }
    }
    fun mayor(other: Humano): Humano{
        if(this.edad.equals(other.edad)){
            if(this.nombre.length>other.nombre.length){
                return this
            }else{
                return other
            }
        }else if (this.edad>other.edad){
            return this
        }else{
            return other
        }
    }

}