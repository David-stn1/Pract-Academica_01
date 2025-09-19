package com.example.listado_alumnos

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerview = findViewById<RecyclerView>(R.id.recyclerPersonas)
        recyclerview.layoutManager = LinearLayoutManager(this)
        val data = ArrayList<Alumno>()

        for (i in 1 .. 50) {
            data.add(Alumno("David Antonio Gutierrez", "20202860", "dgutierrez32@ucol.mx", "https://i.pinimg.com/236x/e0/b8/3e/e0b83e84afe193922892917ddea28109.jpg"))
        }

        val adapter = AlumnoAdapter(this,data)
        recyclerview.adapter = adapter
    }
}
