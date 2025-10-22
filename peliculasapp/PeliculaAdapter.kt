package com.example.peliculasapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class PeliculaAdapter(private var peliculasLista:List<Pelicula>,
    private val onClickListener:(Pelicula)->Unit): RecyclerView.Adapter<PeliculaViewHolder>(){
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PeliculaViewHolder {
            val layoutInflater = LayoutInflater.from(parent.context)
            return PeliculaViewHolder(layoutInflater.inflate(R.layout.item_peliculas, parent, false))
        }

        override fun onBindViewHolder(holder: PeliculaViewHolder, position: Int) {
            val item=peliculasLista[position]
            holder.render(item,onClickListener)
        }

        override fun getItemCount(): Int {
            return peliculasLista.size
        }
    }
