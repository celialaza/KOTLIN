package com.example.ud6

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView


class PersonaAdapter (private var personasLista:List<Persona>): RecyclerView.Adapter<PersonaViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PersonaViewHolder {
    val layoutInflater= LayoutInflater.from(parent.context)
    return PersonaViewHolder(layoutInflater.inflate(R.layout.item_personas,parent,false))
    }

    override fun onBindViewHolder(holder: PersonaViewHolder, position: Int) {
        val item=personasLista[position]
        holder.render(item)
    }

    override fun getItemCount(): Int {
        return personasLista.size
    }
}