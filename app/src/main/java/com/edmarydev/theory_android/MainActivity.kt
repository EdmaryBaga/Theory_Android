package com.edmarydev.theory_android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.edmarydev.theory_android.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private  lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //inflamos la vista desde el ActivityMainBinding
        binding = ActivityMainBinding.inflate(layoutInflater)
        //mostramos la vista
        setContentView(binding.root)

        //accedemos al elemento para agregarle un evento
        binding.buttonToast.setOnClickListener { toast() }
    }

    private fun toast(){
        Toast.makeText(this, "Soy un toast!",Toast.LENGTH_LONG).show();
    }
}