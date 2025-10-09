package com.example.ud6

class PersonaProvider {
    companion object{
        fun cargarLista():MutableList<Persona>{
            return mutableListOf(
                Persona("Ana", "Amante de la naturaleza", R.drawable.chica01),
                Persona("Carlos", "Le gusta programar y enseñar", R.drawable.chico01),
                Persona("Maria","Aficionada a la música",R.drawable.chica02),
                Persona("Pablo","Fotógrafo profesional", R.drawable.chico02),
                Persona("Lucía","fanática de los libros de misterio",R.drawable.chica03),
                Persona("Javier","Deportiste y corredor de maratones",R.drawable.chico03),
                Persona("Sofía","Cocina platos internacionales",R.drawable.chica04),
                Persona("Miguel","Apasionado por los viajes",R.drawable.chico04),
                Persona("Laura","Diseñadora gráfica",R.drawable.chica05),
                Persona("Javier","Deportiste y corredor de maratones",R.drawable.chico03),
            Persona("Sofía","Cocina platos internacionales",R.drawable.chica04),
            Persona("Miguel","Apasionado por los viajes",R.drawable.chico04),
            Persona("Laura","Diseñadora gráfica",R.drawable.chica05)


                )

        }
    }
}