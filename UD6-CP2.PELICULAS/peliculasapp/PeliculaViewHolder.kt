package com.example.peliculasapp

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.peliculasapp.databinding.ItemPeliculasBinding

class PeliculaViewHolder (view: View): RecyclerView.ViewHolder(view) {
    private val binding= ItemPeliculasBinding.bind(view)

    fun render(item: Pelicula, onClickListener: (Pelicula)->Unit){
        binding.tvPeliculaTitulo.text=item.titulo
        binding.ivPelicula.setImageResource(item.imagen)
        itemView.setOnClickListener{
            onClickListener(item)
        }
    }
}