package com.example.infocinemaupb

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Configurar la navegación de cada opción
        val inicioTextView: TextView = findViewById(R.id.nav_inicio)
        val top10TextView: TextView = findViewById(R.id.nav_top_10)
        val filtrosTextView: TextView = findViewById(R.id.nav_filtros)
        val creditosTextView: TextView = findViewById(R.id.nav_creditos)

        // Navegar a InicioActivity cuando se haga clic en "Inicio"
        inicioTextView.setOnClickListener {
            val intent = Intent(this, InicioActivity::class.java)
            startActivity(intent)
        }

        // Navegar a Top10Activity cuando se haga clic en "top 10"
        top10TextView.setOnClickListener {
            val intent = Intent(this, Top10Activity::class.java)
            startActivity(intent)
        }

        // Navegar a FiltrosActivity cuando se haga clic en "filtros"
        filtrosTextView.setOnClickListener {
            val intent = Intent(this, FiltrosActivity::class.java)
            startActivity(intent)
        }

        // Navegar a CreditosActivity cuando se haga clic en "creditos"
        creditosTextView.setOnClickListener {
            val intent = Intent(this, CreditosActivity::class.java)
            startActivity(intent)
        }
    }
}
