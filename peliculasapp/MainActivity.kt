package com.example.peliculasapp

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.peliculasapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var listaPeliculas:MutableList<Pelicula>
    private lateinit var adapter: PeliculaAdapter
    private lateinit var layoutManager: RecyclerView.LayoutManager

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater=menuInflater
        inflater.inflate(R.menu.menu,menu)
        return true
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        listaPeliculas= mutableListOf()
        listaPeliculas.addAll(PeliculaProvider.cargarLista)
        layoutManager = LinearLayoutManager(this)
        binding.rvPeliculas.layoutManager = layoutManager
        adapter = PeliculaAdapter(listaPeliculas) { pelicula ->
            onItemSelected(pelicula)
        }
        binding.rvPeliculas.adapter = adapter
        binding.rvPeliculas.setHasFixedSize(true)

    }
    private fun onItemSelected(pelicula: Pelicula){
        Toast.makeText(this,"Duración: ${pelicula.duracion}- Año: ${pelicula.año}", Toast.LENGTH_SHORT).show()
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
       val toast:Toast
       when (item.itemId){
           R.id.cargar ->{
               listaPeliculas.clear()
               listaPeliculas.addAll(PeliculaProvider.cargarLista)
               adapter.notifyDataSetChanged()
               toast =Toast.makeText(
                   applicationContext,
                   "Cargar lista", Toast.LENGTH_SHORT
               )
               toast.show()
           }
           R.id.limpiar ->{
               listaPeliculas.clear()
               adapter.notifyDataSetChanged()
               toast =Toast.makeText(
                   applicationContext,
                   "Limpiar lista", Toast.LENGTH_SHORT
               )
               toast.show()
           }
        }
        return true
    }
}