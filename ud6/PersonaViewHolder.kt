package com.example.ud6

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.ud6.databinding.ItemPersonasBinding

class PersonaViewHolder(view: View): RecyclerView.ViewHolder(view) {
    private val binding= ItemPersonasBinding.bind(view)
    fun render(item:Persona){
        binding.tvPersonaNombre.text=item.nombre
        binding.tvDescripcion.text=item.descripcion
        binding.ivPersona.setImageResource(item.imagen)
    }
}