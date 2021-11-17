package com.edmarydev.theory_android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.speech.tts.TextToSpeech
import android.util.Log
import com.edmarydev.theory_android.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), TextToSpeech.OnInitListener {

    private lateinit var binding: ActivityMainBinding
    var tts : TextToSpeech? =null

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        tts = TextToSpeech(this,this)

        var message : String = binding.tvMessage.text.toString()

        Log.i("message view", message)

    }

    override fun onInit(status: Int) {
        binding.tvMessage.clearComposingText()
        if(status == TextToSpeech.SUCCESS){
            binding.tvMessage.text = "Listo!"
        }
        else{
            binding.tvMessage.text = "No disponible!"
        }
    }

}