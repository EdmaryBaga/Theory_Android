package com.edmarydev.theory_android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.edmarydev.theory_android.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.checkBox.setOnClickListener(){
            if(binding.checkBox.isChecked){
                Toast.makeText(this, "Se activo!", Toast.LENGTH_LONG).show();
            }else{
                Toast.makeText(this, "Se desactivo!", Toast.LENGTH_LONG).show();
            }

        }
    }

    fun RecuerdaUser(view: android.view.View) {}
}