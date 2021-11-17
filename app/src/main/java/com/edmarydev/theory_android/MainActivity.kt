package com.edmarydev.theory_android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.speech.tts.TextToSpeech
import android.util.Log
import com.edmarydev.theory_android.databinding.ActivityMainBinding
import java.util.*

class MainActivity : AppCompatActivity(), TextToSpeech.OnInitListener {

    private lateinit var binding: ActivityMainBinding
    var tts : TextToSpeech? =null

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        tts = TextToSpeech(this,this)

        binding.btnSpeech.setOnClickListener(){speack()}


    }

    private fun speack(){
        var message : String = binding.etNewmessage.text.toString()
        tts!!.speak(message, TextToSpeech.QUEUE_FLUSH, null, "")
    }

    override fun onInit(status: Int) {
        binding.tvMessage.clearComposingText()
        if(status == TextToSpeech.SUCCESS){
            binding.tvMessage.text = "I can speack!"
            tts!!.setLanguage(Locale("ES"))
        }
        else{
            binding.tvMessage.text = "I am mute!"
        }
    }

}