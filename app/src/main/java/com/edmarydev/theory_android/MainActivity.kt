package com.edmarydev.theory_android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.edmarydev.theory_android.databinding.ActivityMainBinding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    /**
     * Para configurar nuestro retrofit usamos el metodo Builder()
     *.addConverterFactory(GsonConverterFactory.create(), se encargara de pasar nuestro Json a DogResponse(dataClass)
     * con la llamada a build aplicamos lo anterior
     * */

    private fun getRetrofit():Retrofit{
        return Retrofit.Builder()
            .baseUrl("https://dog.ceo/api/breed/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    private fun searchByName(query:String){
        CoroutineScope(Dispatchers.IO).launch{
            val call = getRetrofit().create(APIService::class.java).getDogsByBreeds("$query/images")
            val puppies = call.body()
            if(call.isSuccessful){
                print("Obtuvimos los datos del API")
            }else{
                print("Hubo un error")
            }
        }
    }
}