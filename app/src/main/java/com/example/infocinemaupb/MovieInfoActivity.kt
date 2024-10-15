package com.example.infocinemaupb

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout

class MovieInfoActivity : AppCompatActivity() {

    private lateinit var logoSection: ImageView
    private lateinit var navInicio: TextView
    private lateinit var navTop10: TextView
    private lateinit var navFiltros: TextView
    private lateinit var navCreditos: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_info)

        // Inicializa los elementos de la interfaz
        logoSection = findViewById(R.id.logo)
        navInicio = findViewById(R.id.nav_inicio)
        navTop10 = findViewById(R.id.nav_top_10)
        navFiltros = findViewById(R.id.nav_filtros)
        navCreditos = findViewById(R.id.nav_creditos)


        // Configura las acciones de los elementos
        navInicio.setOnClickListener {
            // Lógica para la navegación a la pantalla de inicio
            startActivity(Intent(this, InicioActivity::class.java))
        }

        navTop10.setOnClickListener {
            // Lógica para la navegación a la pantalla de Top 10
            startActivity(Intent(this, Top10Activity::class.java))
        }

        navFiltros.setOnClickListener {
            // Lógica para la navegación a los filtros
            startActivity(Intent(this, FiltrosActivity::class.java))
        }

        navCreditos.setOnClickListener {
            // Lógica para la navegación a créditos
            startActivity(Intent(this, CreditosActivity::class.java))
        }
    }
}
