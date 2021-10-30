package com.edmarydev.theory_android

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Url

interface APIService {

    //tenemos cuatro tipos de llamada GET, POST, PUT y DELETE
    //La palbra reservada suspend nos permite trabajar con corrutinas,
    // si no la agregamos nuestro codigo con corrutinas no funcionara
    @GET
    suspend fun getDogsByBreeds (@Url url:String) : Response<DogsResponse>

}