package com.example.prueba4lab4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.UserHandle
import java.util.ArrayList

class MainActivity : AppCompatActivity() {

    private lateinit var peluchito: Peluchito
    private var listUsers : ArrayList<Peluchito> = ArrayList()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
