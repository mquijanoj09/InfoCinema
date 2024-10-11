package com.example.infocinemaupb

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout

class InicioActivity : AppCompatActivity() {

    // Define los elementos de la interfaz
    private lateinit var logoSection: ImageView
    private lateinit var navInicio: TextView
    private lateinit var navTop10: TextView
    private lateinit var navFiltros: TextView
    private lateinit var navCreditos: TextView
    private lateinit var estreno1: ImageView
    private lateinit var estreno2: ImageView
    private lateinit var estreno3: ImageView
    private lateinit var estreno4: ImageView
    private lateinit var genreTerror: Button
    private lateinit var genreComedia: Button
    private lateinit var genreFiccion: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inicio_cinema)

        // Inicializa los elementos de la interfaz
        logoSection = findViewById(R.id.logo)
        navInicio = findViewById(R.id.nav_inicio)
        navTop10 = findViewById(R.id.nav_top_10)
        navFiltros = findViewById(R.id.nav_filtros)
        navCreditos = findViewById(R.id.nav_creditos)
        estreno1 = findViewById(R.id.estreno_1)
        estreno2 = findViewById(R.id.estreno_2)
        estreno3 = findViewById(R.id.estreno_3)
        estreno4 = findViewById(R.id.estreno_4)
        genreTerror = findViewById(R.id.genre_terror)
        genreComedia = findViewById(R.id.genre_comedia)
        genreFiccion = findViewById(R.id.genre_ficcion)

        // Configura las acciones de los elementos
        navInicio.setOnClickListener {
            // Lógica para la navegación a la pantalla de inicio
            Toast.makeText(this, "Navegando a Inicio", Toast.LENGTH_SHORT).show()
            // Por ejemplo, podrías iniciar otra actividad:
            // startActivity(Intent(this, MainActivity::class.java))
        }

        navTop10.setOnClickListener {
            // Lógica para la navegación a la pantalla de Top 10
            Toast.makeText(this, "Navegando a Top 10", Toast.LENGTH_SHORT).show()
        }

        navFiltros.setOnClickListener {
            // Lógica para la navegación a los filtros
            Toast.makeText(this, "Navegando a Filtros", Toast.LENGTH_SHORT).show()
        }

        navCreditos.setOnClickListener {
            // Lógica para la navegación a créditos
            Toast.makeText(this, "Navegando a Créditos", Toast.LENGTH_SHORT).show()
        }

        // Establece click listeners para los géneros
        genreTerror.setOnClickListener {
            // Lógica para mostrar películas de terror
            Toast.makeText(this, "Explorando Terror", Toast.LENGTH_SHORT).show()
        }

        genreComedia.setOnClickListener {
            // Lógica para mostrar películas de comedia
            Toast.makeText(this, "Explorando Comedia", Toast.LENGTH_SHORT).show()
        }

        genreFiccion.setOnClickListener {
            // Lógica para mostrar películas de ficción
            Toast.makeText(this, "Explorando Ficción", Toast.LENGTH_SHORT).show()
        }
    }
}
